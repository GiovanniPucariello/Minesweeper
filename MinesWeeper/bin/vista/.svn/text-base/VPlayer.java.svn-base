package vista;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VPlayer extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JPanel panel;
	private JTextField txtName;
	private JSeparator jSeparator1;
	private JButton btnOk;
	private JLabel lbName;
	private JLabel lbTime;
	private JLabel jLabel1;
	private long time;

	public VPlayer() {
		super();
		getContentPane().setBackground(new java.awt.Color(140,205,230));
		initGUI();
	}
	public VPlayer(long t) {
		super();
		this.time = t;
		getContentPane().setBackground(new java.awt.Color(173,216,230));
		initGUI();
	}
	
	private void initGUI() {
		try {
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				panel = new JPanel();
				getContentPane().add(panel, new AnchorConstraint(12, 21, 12, 20, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				panel.setLayout(null);
				panel.setPreferredSize(new java.awt.Dimension(319, 113));
				panel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				panel.setBackground(new java.awt.Color(110,180,204));
				{
					jLabel1 = new JLabel();
					panel.add(jLabel1);
					jLabel1.setText("Congratulations");
					jLabel1.setBounds(92, 12, 132, 27);
					jLabel1.setFont(new java.awt.Font("URW Chancery L",1,20));
					jLabel1.setForeground(new java.awt.Color(255,255,255));
				}
				{
					txtName = new JTextField();
					panel.add(getTxtName());
					txtName.setBounds(79, 65, 147, 25);
					txtName.setFont(new java.awt.Font("URW Chancery L",1,16));
				}
				{
					lbTime = new JLabel();
					panel.add(getLbTime());
					lbTime.setText(String.valueOf(new SimpleDateFormat("mm:ss").format(time)));
					lbTime.setBounds(234, 68, 58, 22);
					lbTime.setFont(new java.awt.Font("URW Chancery L",1,16));
					lbTime.setForeground(new java.awt.Color(255,255,255));
				}
				{
					lbName = new JLabel();
					panel.add(lbName);
					lbName.setText("Name:");
					lbName.setBounds(23, 65, 54, 22);
					lbName.setFont(new java.awt.Font("URW Chancery L",1,18));
					lbName.setForeground(new java.awt.Color(255,255,255));
				}
				{
					btnOk = new JButton();
					panel.add(btnOk);
					btnOk.setText("Ok");
					btnOk.setBounds(127, 105, 55, 27);
					btnOk.setFont(new java.awt.Font("URW Chancery L",1,14));
				}
				{
					jSeparator1 = new JSeparator();
					panel.add(jSeparator1);
					jSeparator1.setBounds(92, 35, 130, 10);
				}
			}

			pack();
			this.setSize(363, 196);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public JTextField getTxtName() {
		return txtName;
	}
	
	public JLabel getLbTime() {
		return lbTime;
	}
	
	
	public void addListener(ActionListener actionListener) {
		this.btnOk.addActionListener(actionListener);	
	}
	
	public void showMessage(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}
}
