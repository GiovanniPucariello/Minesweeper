package vista;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;


import java.awt.Color;

import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;

import javax.swing.SpinnerListModel;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
public class VCustom extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel lbCustom;
	private JPanel panel;
	private JPanel panelBtn;
	private JSeparator jSeparator1;
	private JButton btnOk;
	private JSpinner jSpinner3;
	private JSpinner jSpinner2;
	private JSpinner jSpinner1;
	private JLabel lbMines;
	private JLabel lbVertical;
	private JLabel lbHorizontal;
	private ArrayList<Integer> rows;
	
    private ArrayList<Integer> columns;
    private ArrayList<Integer> bombs;
    
    
	public VCustom(int maxRow, int maxColumn) {
		super();
		getContentPane().setBackground(new java.awt.Color(140,205,240));
		
		rows=new ArrayList<Integer>();
		columns=new ArrayList<Integer>();
		bombs=new ArrayList<Integer>();
		
		
		for(int i=0;i<maxRow;++i)
			rows.add(i, i+4);
		
		for(int i=0;i<maxColumn;++i)
			columns.add(i,i+4);
		
		int maxBomb=6;
		
		for(int i=0;i<maxBomb;++i)
			bombs.add(i,i+1);
        
		
		initGUI();
	}
	
	

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Custom");
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setFont(new java.awt.Font("URW Chancery L",1,22));
			{
				panelBtn = new JPanel();
				getContentPane().add(panelBtn, new AnchorConstraint(741, 856, 932, 163, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				panelBtn.setPreferredSize(new java.awt.Dimension(167, 44));
				panelBtn.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				panelBtn.setBackground(new java.awt.Color(110,180,204));
				{
					btnOk = new JButton();
					panelBtn.add(btnOk);
					btnOk.setText("Ok");
					btnOk.setFont(new java.awt.Font("URW Chancery L",1,14));
					btnOk.setBounds(134, 166, 55, 27);
					btnOk.setPreferredSize(new java.awt.Dimension(66, 32));
					btnOk.setBackground(new java.awt.Color(255,255,255));

				}
			}
			{
				panel = new JPanel();
				getContentPane().add(panel, new AnchorConstraint(41, 939, 689, 72, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				panel.setPreferredSize(new java.awt.Dimension(209, 149));
				panel.setLayout(null);
				panel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				panel.setBackground(new java.awt.Color(110,180,204));
				{
					lbCustom = new JLabel();
					panel.add(lbCustom);
					lbCustom.setText("Custom");
					lbCustom.setBounds(75, 17, 105, 19);
					lbCustom.setFont(new java.awt.Font("URW Chancery L",1,25));
					lbCustom.setBackground(new java.awt.Color(255,255,255));
					lbCustom.setForeground(new java.awt.Color(255,255,255));
					
				}
				{
					lbHorizontal = new JLabel();
					panel.add(lbHorizontal);
					lbHorizontal.setText("Horizontal");
					lbHorizontal.setBounds(22, 54, 101, 15);
					lbHorizontal.setFont(new java.awt.Font("URW Chancery L",1,20));
					lbHorizontal.setBackground(new java.awt.Color(255,255,255));
					lbHorizontal.setForeground(new java.awt.Color(255,255,255));
				}
				{
					lbVertical = new JLabel();
					panel.add(lbVertical);
					lbVertical.setText("Vertical");
					lbVertical.setBounds(22, 89, 91, 15);
					lbVertical.setFont(new java.awt.Font("URW Chancery L",1,20));
					lbVertical.setBackground(new java.awt.Color(255,255,255));
					lbVertical.setForeground(new java.awt.Color(255,255,255));
				}
				{
					lbMines = new JLabel();
					panel.add(lbMines);
					lbMines.setText("Mines");
					lbMines.setBounds(27, 124, 80, 15);
					lbMines.setFont(new java.awt.Font("URW Chancery L",1,20));
					lbMines.setBackground(new java.awt.Color(255,255,255));
					lbMines.setForeground(new java.awt.Color(255,255,255));
				}
				{
					SpinnerListModel jSpinner1Model = 
						new SpinnerListModel(
								rows);
					jSpinner1 = new JSpinner();
					panel.add(jSpinner1);
					jSpinner1.setModel(jSpinner1Model);
					jSpinner1.setBounds(135, 52, 57, 22);
					jSpinner1.getEditor().setFont(new java.awt.Font("URW Gothic L",0,12));
					
				}
				{
					SpinnerListModel jSpinner2Model = 
						new SpinnerListModel(
								columns);
					jSpinner2 = new JSpinner();
					panel.add(jSpinner2);
					jSpinner2.setModel(jSpinner2Model);
					jSpinner2.setBounds(135, 88, 57, 22);
					jSpinner2.setFont(new java.awt.Font("URW Gothic L",0,12));
				}
				{
					
					
					SpinnerListModel jSpinner3Model = 
						new SpinnerListModel(bombs);
					jSpinner3 = new JSpinner();
					panel.add(jSpinner3);
					jSpinner3.setModel(jSpinner3Model);
					jSpinner3.setBounds(135, 122, 57, 22);
					jSpinner3.getEditor().setFont(new java.awt.Font("URW Gothic L",0,12));

				}
				{
					jSeparator1 = new JSeparator();
					panel.add(jSeparator1);
					jSeparator1.setBounds(2, 38, 219, 10);
				}
			}
			pack();
			this.setSize(251, 260);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public JSpinner getSpinRow() {
		return jSpinner1;
	}
	
	public JSpinner getSpinColumn() {
		return jSpinner2;
	}
	
	public JSpinner getSpinBomb() {
		return jSpinner3;
	}
	
	public void addListener(ActionListener actionListener) {
		this.btnOk.addActionListener(actionListener);
		
		
	}
	
	public void addChangeList(ChangeListener listener) {
		this.jSpinner1.addChangeListener(listener);
		this.jSpinner2.addChangeListener(listener);
		
		
		
	}
}
