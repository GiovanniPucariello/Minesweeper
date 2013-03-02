package bean;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Build er, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private JButton b,jButton1;
	private Chronometer crono;
	
	@Override
	public boolean lostFocus(Event evt,Object what)
	{
		System.out.println("siiiiiiiiiiiii la pegamos!");
		
		return false;
	}

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
System.out.println("inicio");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("NO");
				jButton1.setBounds(100, 48, 67, 22);
				
			
				jButton1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent evt) {
						
						jButton1.setText((jButton1.getText().equals("NO")) ? "SI": "NO");
						crono.pause();
					}
				});
				
				b = new JButton();
				getContentPane().add(b);
				b.setText("restartssydf");
				b.setBounds(200, 100, 67, 22);
				
			
				b.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent evt) {
						
						crono.restart();
					}
				});
				
			}
				
			{
				crono = new Chronometer();
				getContentPane().add(crono);
				crono.setBounds(112, 108, 60, 19);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
