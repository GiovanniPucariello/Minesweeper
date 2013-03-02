import java.math.*;
import java.util.*;
import java.io.*;

import vista.VWelcome;
import controlador.*;


/* Grupo 2 Equipo 7
 * Andres Arrieche C.I V- 19.423.804
 * Douglas Liscano C.I V- 18.431.266
 * Jeniree Ramirez C.I V- 18.619.418
 * Moises Medina   C.I V- 18.655.464
 *  
 * */

public class Main {

	public static void main(String []str)
	{		
		ControladorMinesWeeper contrl = new ControladorMinesWeeper();
		VWelcome inst = new VWelcome(contrl.getViewMinesWeeper());//ControladorStore();//ControladorPlayer();
	
		inst.setLocationRelativeTo(null);
		inst.setResizable(false);
		inst.setVisible(true);
	}
}