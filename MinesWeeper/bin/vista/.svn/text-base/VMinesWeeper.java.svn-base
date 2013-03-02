package vista;

import bean.Chronometer;
import bean.LabelSound;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import javabean.JPanelImagen;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;

import modelo.data.*;


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
public class VMinesWeeper extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JMenuBar menuprincipal;
	private JMenu mGame;
	private JMenu mLevel;
	private JMenu mAbout;
	private JMenuItem mNewGame;
	private JMenuItem mScore;
	private JMenuItem mExit;
	
	private JRadioButtonMenuItem small;
	private JRadioButtonMenuItem medium;
	private JRadioButtonMenuItem large;
	private JRadioButtonMenuItem custom;
	private JPanel panFondo;
	private Chronometer chronometer;
	private LabelSound sound;
	private JTextField txtCountFlag;
	private JButton btnRestart;
	private JPanel panPrincipal;
	private JSeparator jSeparator3;
	private JSeparator jSeparator2;
	/**
	* Auto-generated main method to display this JFrame
	*/
	javax.swing.JFrame fondo = new javax.swing.JFrame();

	public VMinesWeeper() {
		super();		
		getContentPane().setBackground(new java.awt.Color(255,255,255));
		initGUI();
	}
	
	public JPanel getPanel() {
		return panFondo;
	}

	
	private void initGUI() {
		try
		{
			panFondo = new JPanel();
			
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);	
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					
					if(getLabelSound().getClip()!=null)
						getLabelSound().getClip().close();
				}
			});
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				panPrincipal = new JPanel();
				AnchorLayout jPanel2Layout = new AnchorLayout();
				getContentPane().add(panPrincipal, new AnchorConstraint(0, 0, 226, 0, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS, AnchorConstraint.ANCHOR_ABS));
				panPrincipal.setPreferredSize(new java.awt.Dimension(372, 49));
				panPrincipal.setLayout(jPanel2Layout);
				panPrincipal.setBackground(new java.awt.Color(110,180,204));
				{
					chronometer = new Chronometer();
					sound = new LabelSound();
					panPrincipal.add(chronometer, new AnchorConstraint(255, 271, 811, 60, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				}
				{
					btnRestart = new JButton();
					panPrincipal.add(btnRestart, new AnchorConstraint(166, 553, 833, 420, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					btnRestart.setIcon(new ImageIcon(getClass().getClassLoader().getResource("picture/smiley.png")));
					btnRestart.setPreferredSize(new java.awt.Dimension(46, 38));
					btnRestart.setBackground(new java.awt.Color(255,255,255));
				}
				{
					txtCountFlag = new JTextField();
					panPrincipal.add(txtCountFlag, new AnchorConstraint(239, 936, 843, 750, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					txtCountFlag.setText("   10");
					txtCountFlag.setFont(new java.awt.Font("URW Chancery L",0,22));
					txtCountFlag.setEditable(false);
					txtCountFlag.setPreferredSize(new java.awt.Dimension(57, 29));
					txtCountFlag.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
					txtCountFlag.setBackground(new java.awt.Color(110,180,204));
				}
				
				{
					chronometer.setFont(new java.awt.Font("URW Chancery L",0,22));
					chronometer.setPreferredSize(new java.awt.Dimension(75, 25));
					chronometer.setBackground(new java.awt.Color(191,191,191));
					chronometer.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				}
			}
			{
				menuprincipal = new JMenuBar();
				setJMenuBar(menuprincipal);
				menuprincipal.setBackground(new java.awt.Color(110,180,210));
				{
					mGame = new JMenu();
					menuprincipal.add(mGame);
					mGame.setText("Game");
					mGame.setFont(new java.awt.Font("URW Chancery L",1,18));
					{
						mNewGame = new JMenuItem();
						mGame.add(mNewGame);
						mNewGame.setText("New Game");
						mNewGame.setFont(new java.awt.Font("URW Chancery L",1,18));
					}
					{
						mLevel = new JMenu();
						mGame.add(mLevel);
						mLevel.setText("Level");
						mLevel.setFont(new java.awt.Font("URW Chancery L",1,18));
						{
							small = new JRadioButtonMenuItem();
							mLevel.add(small);
							small.setText("Small");
							small.setFont(new java.awt.Font("URW Chancery L",1,18));
						}
						{
							medium = new JRadioButtonMenuItem();
							mLevel.add(medium);
							medium.setText("Medium");
							medium.setFont(new java.awt.Font("URW Chancery L",1,18));
						}
						{
							large = new JRadioButtonMenuItem();
							mLevel.add(large);
							large.setText("Large");
							large.setFont(new java.awt.Font("URW Chancery L",1,18));
							
						}
						{
							custom = new JRadioButtonMenuItem();
							mLevel.add(custom);
							custom.setText("Custom");
							custom.setFont(new java.awt.Font("URW Chancery L",1,18));
						}
					}
					{
						mScore = new JMenuItem();
						mGame.add(mScore);
						mScore.setText("Scores");
						mScore.setFont(new java.awt.Font("URW Chancery L",1,18));
						{
							jSeparator2 = new JSeparator();
							mScore.add(jSeparator2);
						}
					}
					{
						mExit = new JMenuItem();
						mGame.add(mExit);
						mExit.setText("Exit");
						mExit.setFont(new java.awt.Font("URW Chancery L",1,18));
						{
							jSeparator3 = new JSeparator();
							mExit.add(jSeparator3);
						}
					}
				}
				{
					mAbout = new JMenu();
					menuprincipal.add(mAbout);
					mAbout.setText("About");
					mAbout.setFont(new java.awt.Font("URW Chancery L",1,18));
				}
			}
			pack();
			this.setSize(382, 336);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public Chronometer getChronometer() {
		return chronometer;
	}
	
	public LabelSound getLabelSound() {
		return sound;
	}
	
	
	public JButton getRestart() {
		return btnRestart;
	}

	public JTextField gettxtCountFlag() {
		return txtCountFlag;
	}
	
	public JRadioButtonMenuItem getSmall() {
		return small;
	}

	public void setPanel(JPanel panFondo) {
		this.panFondo = panFondo;
	}

	public void setSmall(JRadioButtonMenuItem small) {
		this.small = small;
	}
	
	public JRadioButtonMenuItem getMedium() {
		return medium;
	}

	public void setMedium(JRadioButtonMenuItem medium) {
		this.medium = medium;
	}

	public JRadioButtonMenuItem getLarge() {
		return large;
	}

	public void setLarge(JRadioButtonMenuItem large) {
		this.large = large;
	}

	public void addListener(ActionListener actionListener) {
		this.mNewGame.addActionListener(actionListener);
		this.mLevel.addActionListener(actionListener);
		this.mScore.addActionListener(actionListener);
		this.mExit.addActionListener(actionListener);
		this.mAbout.addActionListener(actionListener);
		this.small.addActionListener(actionListener);
		this.medium.addActionListener(actionListener);
		this.large.addActionListener(actionListener);
		this.custom.addActionListener(actionListener);
		this.btnRestart.addActionListener(actionListener);
		
		
	}
	/*public void addWListener(WindowAdapter windowAdapter) {
		this.addWindowListener(windowAdapter);
		
	}*/
	
	public void showMessage(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
}
