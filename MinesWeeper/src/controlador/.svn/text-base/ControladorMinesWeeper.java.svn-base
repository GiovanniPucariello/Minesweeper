package controlador;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import java.util.*;

import vista.VAbout;
import vista.VCustom;
import vista.VMinesWeeper;
import modelo.dao.ScoreDAO;
import modelo.data.*;

public class ControladorMinesWeeper implements ActionListener{

	final int maxRow = 50;
	final int maxColumn = 50;
	
	
	private static int row;
	private static int column;
	private static int flags;
	private static int cellOpened;
	private static int bombs;
	private boolean isPlaying;
	private int level;
	
	public VMinesWeeper getViewMinesWeeper() {
		return viewMinesWeeper;
	}

	public void setViewMinesWeeper(VMinesWeeper viewMinesWeeper) {
		this.viewMinesWeeper = viewMinesWeeper;
	}

	private VMinesWeeper viewMinesWeeper;
	private VAbout viewAbout;
	
	final static int []mines = {10,40,100};
	final static int []rowsByLevels = {10,16,22};
	
	private static boolean preCalculos[][];
	private static Cell[][] cells;
	
	private static Map<Integer,String>rutas = new HashMap<Integer,String>();
	
	public static int Random(int min,int max)
	{
		return (int)Math.floor(Math.random() * 100) % (max-min+1) + min;
	}
	
	public ControladorMinesWeeper()
	{
		 super();
		
		 CargarRutas();
		 
		 this.viewMinesWeeper = new VMinesWeeper();
		 this.viewMinesWeeper.addListener(this);
		 
		 viewMinesWeeper.setLocationRelativeTo(null);
		 
		 cells = new Cell[maxColumn][maxRow];
		 preCalculos = new boolean[maxColumn][maxRow];

		 createButtons(maxColumn,maxRow);
		 
		this.bombs = mines[0];
		 this.row = this.rowsByLevels[0];
		 this.column = this.rowsByLevels[0];
		 
		 this.isPlaying = false;
		 this.level = 1;
		 
		 newGame();
		 
		 this.viewMinesWeeper.getSmall().setSelected(true);
		 
		 this.viewMinesWeeper.setVisible(true);
		 
	}
	
	public static int getRow() {
		return row;
	}

	public static void setRow(int row) {
		ControladorMinesWeeper.row = row;
	}

	public static int getColumn() {
		return column;
	}

	public static void setColumn(int column) {
		ControladorMinesWeeper.column = column;
	}

	public static int getBombs() {
		return bombs;
	}

	public static void setBombs(int bombs) {
		ControladorMinesWeeper.bombs = bombs;
	}

	void CargarRutas()
	{
		for(int i = -2;i <= 8;i++)
			rutas.put(i, "picture/" + i + ".png");
		
		rutas.put(10, "picture/flag.png");
	}
	
	public void PutImage(Cell cell,String ruta)
	{
		//cell.setIcon(new ImageIcon(getClass().getClassLoader().getResource(ruta)));
	
	    ImageIcon fot = new ImageIcon(getClass().getClassLoader().getResource(ruta));
	    Icon ico = new ImageIcon(fot.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	    
	    cell.setIcon(ico);
	}
	
	public void showBombs()
	{
		for(int i = 1;i <= row;i++)
			for(int j = 1;j <= column;j++)
				if(cells[i][j].getId() == -1)
				   PutImage(cells[i][j],rutas.get(-1));
				
		if(this.viewMinesWeeper.getLabelSound().getClip()!=null)
			this.viewMinesWeeper.getLabelSound().getClip().close();
			this.viewMinesWeeper.getLabelSound().putRuta("/sound/Explode.wav");
			this.viewMinesWeeper.getLabelSound().play();
			this.viewMinesWeeper.getLabelSound().clear();
		
		
	}
	
	public void Action(int r,int c)
	{
		if(!this.isPlaying)
		{
			this.isPlaying = true;
			this.viewMinesWeeper.getChronometer().pause();
		}
		
	if(cells[r][c].getIcon()==null)	{
		
		if(cells[r][c].getId() == -1)
		{
		    showBombs();
		    PutImage(cells[r][c],rutas.get(-2));

		    gameOver(false);
		}    
		else if(cells[r][c].getId() != 0)
		{
			this.cellOpened++;
				
			PutImage(cells[r][c],rutas.get(cells[r][c].getId()));
			//cells[r][c].setEnabled(false);
		}
		else
		{
			for(int i = 0;i <= this.row + 1;i++)
				for(int j = 0;j <= this.column + 1;j++)
					preCalculos[i][j] = false;
			
			empty(r,c);	
		}
		
	}
		
		if(this.cellOpened == (this.column * this.row - this.bombs))
			gameOver(true);
		
	}
	
	public void Ini()
	{
		for(int i = 0;i < this.maxRow;i++)
			for(int j = 0;j < this.maxColumn;j++)
			{
				cells[i][j].setEnabled(false);
				cells[i][j].setHasFlag(false);
				cells[i][j].setVisible(false);
				cells[i][j].setId(0);
			}
	}
	
	public void newGame()
	{
		Ini();
		
		this.flags = 0;
		this.cellOpened = 0;		
		
		Fill(this.bombs);
		Num();
		
		this.viewMinesWeeper.remove(this.viewMinesWeeper.getPanel());
		
		JPanel panel = new JPanel();
		this.viewMinesWeeper.setPanel(panel);
			
		panel.setLayout(new GridLayout(this.row,this.column));
		
		for(int i = 1;i <= this.row;i++)
			for(int j = 1;j <= this.column;j++)
			{
				cells[i][j].setEnabled(true);
				cells[i][j].setHasFlag(false);
				cells[i][j].setVisible(true);
				         
				panel.add(cells[i][j]);
			}
		
		this.isPlaying = false;
		
		this.viewMinesWeeper.getChronometer().restart();
		this.viewMinesWeeper.getChronometer().pause();
		
		this.viewMinesWeeper.getChronometer().setText("00:00");
		
		this.viewMinesWeeper.gettxtCountFlag().setText(String.valueOf(bombs));
		
		this.viewMinesWeeper.setLayout(new AnchorLayout());
		
		this.viewMinesWeeper.getContentPane().add(this.viewMinesWeeper.getPanel(), new AnchorConstraint
				(70, 800, 900, 35, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_ABS));		
										
		this.viewMinesWeeper.repaint();
		
		printByConsole();
		if(this.viewMinesWeeper.isVisible()){
		if(this.viewMinesWeeper.getLabelSound().getClip()!=null)
			this.viewMinesWeeper.getLabelSound().close();
			this.viewMinesWeeper.getLabelSound().putRuta("/sound/M3.wav");
			this.viewMinesWeeper.getLabelSound().playRepeat();
			this.viewMinesWeeper.getLabelSound().clear();
		}
	}
	
	public void gameOver(boolean w)
	{
		this.viewMinesWeeper.getChronometer().pause();
		
		if(w)
		{
			if(this.viewMinesWeeper.getLabelSound().getClip()!=null)
			this.viewMinesWeeper.getLabelSound().close();
			this.viewMinesWeeper.getLabelSound().putRuta("/sound/W3.wav");
			this.viewMinesWeeper.getLabelSound().play();
			
			
			this.viewMinesWeeper.showMessage("You won!" + " : " + this.viewMinesWeeper.getChronometer().getTime());
			this.viewMinesWeeper.getLabelSound().stop();
			
			putNewScore();
			this.viewMinesWeeper.getLabelSound().clear();
		}
		else
		{
			if(this.viewMinesWeeper.getLabelSound().getClip()!=null)
				this.viewMinesWeeper.getLabelSound().close();
				this.viewMinesWeeper.getLabelSound().putRuta("/sound/L.wav");
				this.viewMinesWeeper.getLabelSound().play();
				this.viewMinesWeeper.getLabelSound().clear();
			this.viewMinesWeeper.showMessage("You Lost!");
			
		}
		newGame();
	}
	
	void putNewScore()
	{if(this.viewMinesWeeper.getLabelSound().getClip()!=null)
		this.viewMinesWeeper.getLabelSound().close();
	this.viewMinesWeeper.getLabelSound().play();
	
		ScoreDAO DAO = new ScoreDAO();
    	List<Player> players = DAO.searchPlayer();
    	List<Player> playersByLevel = new ArrayList<Player>();
		
		for(int i = 0;i < players.size();i++)
			if(players.get(i).getCodlevel() == this.level)
				playersByLevel.add(players.get(i));
		
		if(playersByLevel.size() < 5)
		{
			Player player = new Player("",this.viewMinesWeeper.getChronometer().getTime(),this.level);
			new ControladorPlayer(player);
		}
		else if(playersByLevel.get(4).getScore() > this.viewMinesWeeper.getChronometer().getTime())
	    {
			DAO.deletePlayer(playersByLevel.get(4));
			Player player = new Player("",this.viewMinesWeeper.getChronometer().getTime(),this.level);
			new ControladorPlayer(player);
			
	    }
	}
	
	public void Fill(int N)
	{
		for(int i = 0;i <= row;i++)
			for(int j = 0;j <= column;j++)
			{
				cells[i][j].setId(0);
				cells[i][j].setIcon(null);
			}
	     
	     while(N > 0)
	     {
	    	 int i = Random(1,row),j = Random(1,column);
	    	 
	    	 if(cells[i][j].getId() != -1)
	    	 {
	    		 cells[i][j].setId(-1);
	    		 N--;
	    	 }
	     }  
	}
	
	public static void Num()
	{
		for(int i = 1;i <= row;i++)
			for(int j = 1;j <= column;j++)
			    if(cells[i][j].getId() != -1)
			    	cells[i][j].setId( 
					    			  (cells[i-1][j].getId() == -1 ? 1 : 0) +
			                		  (cells[i][j-1].getId() == -1 ? 1 : 0) +
			                		  (cells[i+1][j].getId() == -1 ? 1 : 0) +
			                		  (cells[i][j+1].getId() == -1 ? 1 : 0) +
			                		  (cells[i+1][j+1].getId() == -1 ? 1 : 0) +
			                		  (cells[i-1][j+1].getId() == -1 ? 1 : 0) +
			                		  (cells[i+1][j-1].getId() == -1 ? 1 : 0) +
			                		  (cells[i-1][j-1].getId() == -1 ? 1 : 0) 
	                		  		);		
	}

	public void empty(int i,int j)
	{
		if((i >= 1 && j >= 1 && i <= row && j <= column) && !preCalculos[i][j] && cells[i][j].getIcon() == null)
		{
			this.cellOpened++;
			
		  if(cells[i][j].getIcon()==null)	{
				
			
			PutImage(cells[i][j],rutas.get(cells[i][j].getId()));

			//cells[i][j].setEnabled(false);
			preCalculos[i][j] = true;
			
		  
			if(cells[i][j].getId() == 0)
			{
				empty(i+1,j);
				empty(i,j+1);
				empty(i-1,j);
				empty(i,j-1);
				empty(i+1,j+1);
				empty(i-1,j-1);
				empty(i-1,j+1);
				empty(i+1,j-1);
			}
		  }
		}
	}
	
	public void searchBombsInFlags()
	{
		boolean finish = true;
		
		for(int i = 1;i <= row;i++)
			for(int j = 1;j <= column;j++)
				if(cells[i][j].getHasFlag() && cells[i][j].getId() != -1)
				{
					finish = false;
					break;
				}
		
		if(finish)
			gameOver(true);
	}
	
	public void createButtons(int alto,int ancho)
	{
		for (int i = 0; i < alto; i++)
		 	for (int j = 0; j < ancho; j++)
			{
				final int _row = i;
				final int _column = j;
				
				cells[i][j] = new Cell();

				cells[i][j].addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseClicked(MouseEvent e) {
						if(e.isMetaDown())
						{
							ImageIcon bandera=new ImageIcon(getClass().getClassLoader().getResource(rutas.get(10)));
						
							if(cells[_row][_column].getIcon() == null && flags < bombs)
							{
								cells[_row][_column].setIcon(bandera);
								
								cells[_row][_column].setHasFlag(true);
								
								flags++;
								
								
							}
							else if(cells[_row][_column].getHasFlag())
							{
								cells[_row][_column].setIcon(null);
							
								cells[_row][_column].setHasFlag(false);
							
								flags--;
								
								
							}
							viewMinesWeeper.gettxtCountFlag().setText(String.valueOf(bombs-flags));
							
							if(flags == bombs)
								searchBombsInFlags();
						}
					}
				});
				         
				cells[i][j].addActionListener(new ActionListener()
				{	
					public void actionPerformed(ActionEvent evt)
					{
						Action(_row,_column);						
					}
				});
			}
	}
	
	void printByConsole() 
	{
		for(int i = 1;i <= this.row;i++)
		{
			for(int j = 1;j <= this.column;j++)
				System.out.printf("%c ",cells[i][j].getId() == -1 ? '.' : (char)(cells[i][j].getId()+48));
			System.out.println();
		}
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		
		if(e.getActionCommand().equals("Small"))
		{
			 this.viewMinesWeeper.getSmall().setSelected(true);
			 this.viewMinesWeeper.getMedium().setSelected(false);
			 this.viewMinesWeeper.getLarge().setSelected(false);
			 this.bombs = mines[0];
			 this.row = this.rowsByLevels[0];
			 this.column = this.rowsByLevels[0];
			 this.level = 1;
			 
			 newGame();
		}
		else if(e.getActionCommand().equals("Medium"))
		{
			 this.viewMinesWeeper.getSmall().setSelected(false);
			 this.viewMinesWeeper.getMedium().setSelected(true);
			 this.viewMinesWeeper.getLarge().setSelected(false);
			 this.bombs = mines[1];
			 this.row = this.rowsByLevels[1];
			 this.column = this.rowsByLevels[1];
			 this.level = 2;
			 
		 	 newGame();
		}
		else if(e.getActionCommand().equals("Large"))
		{
			 this.viewMinesWeeper.getSmall().setSelected(false);
			 this.viewMinesWeeper.getMedium().setSelected(false);
			 this.viewMinesWeeper.getLarge().setSelected(true);
			 this.bombs = mines[2];
			 this.row = this.rowsByLevels[2];
			 this.column = this.rowsByLevels[2];
			 this.level = 3;
			 
			 newGame();
		}
		
		else if(e.getActionCommand().equals("New Game")||
				e.getActionCommand().equals(""))
		{
				newGame();
		}
		else if(e.getActionCommand().equals("Custom")){
			
			new ControladorCustom(maxRow,maxColumn,this);
			this.level = 4;
			
			this.bombs = this.row * this.column;
		}
		else if(e.getActionCommand().equals("Scores"))
			new ControladorScore();
		else if(e.getActionCommand().equals("Exit")){
				viewMinesWeeper.dispose();
			
				if(viewMinesWeeper.getLabelSound().getClip()!=null)
					viewMinesWeeper.getLabelSound().close();}
		else if(e.getActionCommand().equals("About")){
			this.viewAbout.setVisible(true);
		}
		}
	}
