package vista;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javabean.JPanelImagen;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeListener;

import bean.LabelSound;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;

import controlador.ControladorMinesWeeper;

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
public class VWelcome extends javax.swing.JFrame {
	private JPanelImagen p;
	private JLabel lblPlay;
	private JLabel lblQuit;
	private LabelSound sound;
/////////////////////////////////////7
	private VMinesWeeper view;
	public VMinesWeeper getView() {
		return view;
	}
	public void setView(VMinesWeeper view) {
		this.view = view;
	}
	public VWelcome() {
		super();
		initGUI();
	}
	public VWelcome(VMinesWeeper f) {
		super();
		this.view = f;
		initGUI();
	}
	
	private void initGUI() {
		try {
			
			view.setVisible(false);
			
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			{
				p = new JPanelImagen();
				AnchorLayout pLayout = new AnchorLayout();
				p.setLayout(pLayout);
				getContentPane().add(p, new AnchorConstraint(1, 1001, 1001, 1, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				p.setRutaImagen("/picture/fondo1.jpg");
				p.setPreferredSize(new java.awt.Dimension(426, 308));
				{
					sound=new LabelSound();
					if(sound.getClip()!=null)
						sound.close();
						sound.putRuta("/sound/Nokia_1100_Remix.wav");
						sound.play();
						sound.clear();
				}
				{
					lblPlay = new JLabel();
					p.add(lblPlay, new AnchorConstraint(176, 896, 358, 392, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					lblPlay.setText("PLAY");
					lblPlay.setFont(new java.awt.Font("DigifaceWide",3,35));
					lblPlay.setForeground(new java.awt.Color(44,66,224));
					lblPlay.setCursor(new Cursor(Cursor.HAND_CURSOR));
					lblPlay.setPreferredSize(new java.awt.Dimension(255, 52));
					lblPlay.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							if(sound.getClip()!=null)
								sound.close();
								sound.putRuta("/sound/Sms_Car_Alarm.wav");
								sound.play();
								sound.clear();
								
							dispose();
							
							view.setVisible(true);
							
						 if(view.getLabelSound().getClip()!=null)
							 view.getLabelSound().close();
							view.getLabelSound().putRuta("/sound/M3.wav");
							view.getLabelSound().playRepeat();
							view.getLabelSound().clear();
							
							sound.close();
							
						}
					
						
						
					});
					lblPlay.addMouseMotionListener(new MouseAdapter() {
						
						@Override
						public void mouseMoved(MouseEvent e) {
							
						    lblPlay.setForeground(new java.awt.Color(255,0,0));
						    lblPlay.setFont(new java.awt.Font("DigifaceWide",3,50));
							
						}

					});

				}
				{
					lblQuit = new JLabel();
					p.add(lblQuit, new AnchorConstraint(452, 801, 578, 390, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					lblQuit.setText("QUIT");
					lblQuit.setFont(new java.awt.Font("DigifaceWide",3,35));
					lblQuit.setForeground(new java.awt.Color(44,66,224));
					lblQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
					lblQuit.setPreferredSize(new java.awt.Dimension(208, 36));
					lblQuit.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							if(sound.getClip()!=null)
								sound.close();
								sound.putRuta("/sound/Guitar_Sms.wav");
								sound.play();
								sound.clear();
							dispose();
							
							
						}
						
					});
					lblQuit.addMouseMotionListener(new MouseAdapter() {
						
						@Override
						public void mouseMoved(MouseEvent e) {
							
							lblQuit.setForeground(new java.awt.Color(255,0,0));
							lblQuit.setFont(new java.awt.Font("DigifaceWide",3,50));
						}
						
					});
					this.addMouseMotionListener(new MouseAdapter() {
						
						@Override
						public void mouseMoved(MouseEvent e) {
							// TODO Auto-generated method stub
							lblPlay.setForeground(new java.awt.Color(44,66,224));
							lblPlay.setFont(new java.awt.Font("DigifaceWide",3,35));
							lblQuit.setForeground(new java.awt.Color(44,66,224));
							lblQuit.setFont(new java.awt.Font("DigifaceWide",3,35));
						}
						
						
					});
					
				}
			}
			pack();
			this.setSize(516, 316);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void addMouseListener(MouseAdapter listener) {
		this.lblPlay.addMouseListener(listener);
		this.lblQuit.addMouseListener(listener);
		
		
	}
	
	public void addMotionListener(MouseAdapter listener) {
		this.lblPlay.addMouseMotionListener(listener);
		this.lblQuit.addMouseMotionListener(listener);
		this.addMouseMotionListener(listener);
		
	}
	public LabelSound getSound() {
		return sound;
	}
	public void setSound(LabelSound sound) {
		this.sound = sound;
	}
	public JLabel getLblPlay() {
		return lblPlay;
	}
	public void setLblPlay(JLabel lblPlay) {
		this.lblPlay = lblPlay;
	}
	public JLabel getLblQuit() {
		return lblQuit;
	}
	public void setLblQuit(JLabel lblQuit) {
		this.lblQuit = lblQuit;
	}
	
	

}
