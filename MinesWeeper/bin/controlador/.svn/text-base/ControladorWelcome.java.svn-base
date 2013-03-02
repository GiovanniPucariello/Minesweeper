package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;

import org.slf4j.spi.MDCAdapter;

import vista.VMinesWeeper;
import vista.VWelcome;

public class ControladorWelcome implements ActionListener{
	
	private VWelcome viewWelcome;
	
   public ControladorWelcome() {
		super();
		this.viewWelcome = new VWelcome();
          
		
		this.viewWelcome.setVisible(true);
		
	   
   
   }

 public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Play"))
			new ControladorMinesWeeper();
		
	}
  
  



}
