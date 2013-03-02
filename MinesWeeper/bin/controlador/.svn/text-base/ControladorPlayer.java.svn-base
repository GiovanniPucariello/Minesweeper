package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import vista.VMinesWeeper;
import vista.VPlayer;
import modelo.dao.*;
import modelo.data.*;

public class ControladorPlayer implements ActionListener{
	
	private VPlayer viewPlayer;
	private VMinesWeeper viewMinesWeeper;
	private Player player;
	
	public ControladorPlayer() {
		super();
		this.viewMinesWeeper = new VMinesWeeper();
		this.viewPlayer = new VPlayer();
		this.viewPlayer.addListener(this);
		viewPlayer.setLocationRelativeTo(null);
		this.viewPlayer.setVisible(true);
	}
	public ControladorPlayer(Player p) {
		super();
		
		this.player = p;
		
		this.viewMinesWeeper = new VMinesWeeper();
		this.viewPlayer = new VPlayer();
		
		viewPlayer.getLbTime().setText(String.valueOf(new SimpleDateFormat("mm:ss").format(p.getScore())));
		
		this.viewPlayer.addListener(this);
		viewPlayer.setLocationRelativeTo(null);
		this.viewPlayer.setVisible(true);
	}
   
   void savePlayer(){
	   try
		{
	    	if(viewPlayer.getTxtName().equals(""))
	    		viewPlayer.showMessage("Debe llenar todos los datos");
	    	else
	    	{
	    		PlayerDAO DAO = new PlayerDAO();
		    	this.player.setName(viewPlayer.getTxtName().getText().toString());		    
		    	DAO.registrarPlayer(player);
		    	
		    	new ControladorScore(player.getCodlevel() - 1);
	
	    	}
		}catch(Exception e)
		{
			viewPlayer.showMessage("Verifique que los datos sean correctos");
		}
   }

   public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Ok"))
		{
		    savePlayer();
			viewPlayer.dispose();
		}
	}
	
	
}
