package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import vista.VCustom;
import vista.VMinesWeeper;
import controlador.ControladorMinesWeeper;



public class ControladorCustom  implements ActionListener,ChangeListener{
	
    private VCustom viewCustom;
    private ControladorMinesWeeper controladorMinesWeeper;
    private ArrayList<Integer> bombs;
    private int r=4,c=4,b=1;
	public ControladorCustom(int maxRow,int maxColumn,ControladorMinesWeeper contMin)
	{
		super();
		
		controladorMinesWeeper=contMin;
		this.viewCustom = new VCustom(maxRow,maxColumn);
		this.viewCustom.addListener(this);
		this.viewCustom.addChangeList(this);
		viewCustom.setLocationRelativeTo(null);
		this.viewCustom.setVisible(true);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ok")){
			b=(Integer)this.viewCustom.getSpinBomb().getValue();
			controladorMinesWeeper.setRow(r);
			controladorMinesWeeper.setColumn(c);
			controladorMinesWeeper.setBombs(b);
			controladorMinesWeeper.newGame();
		   
			viewCustom.dispose();
		}
			
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		r=(Integer)this.viewCustom.getSpinRow().getValue();
		c=(Integer)this.viewCustom.getSpinColumn().getValue();
		b=(Integer)this.viewCustom.getSpinBomb().getValue();
		int maxBomb=r*c-10;
		bombs=new ArrayList<Integer>();
		
		for(int i=0;i<maxBomb;++i)
			bombs.add(i,i+1);
		SpinnerListModel model = 
			new SpinnerListModel(bombs);
		
		this.viewCustom.getSpinBomb().setModel(model);
		this.viewCustom.getSpinBomb().setValue(b);
		
	}
	
	
}
