package vista;
import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
//import info.clearthought.layout.TableLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;

import modelo.data.Level;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;



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
public class VScore extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JButton bntExit;
	private JScrollPane scpScores;
	private JComboBox comboLevel;
	private JLabel jLabel2;
	private JTable tableScores;
	private String Titulo[];
	
	int t = 0;
	private JSeparator jSeparator2;
	boolean bool = false;
    
	public VScore() {
		super();
		initGUI();
	}
		
	private void initGUI() {
		try {
			ButtonGroup grp = new ButtonGroup();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("Score MinesWeeper");
			{
				jSeparator2 = new JSeparator();
				getContentPane().add(jSeparator2, new AnchorConstraint(268, 1001, 302, 1, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
				jSeparator2.setPreferredSize(new java.awt.Dimension(264, 10));
			}
			{
			
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1, new AnchorConstraint(24, 653, 125, 346, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					jLabel1.setText("Score");
					jLabel1.setFont(new java.awt.Font("URW Chancery L",0,40));
					jLabel1.setPreferredSize(new java.awt.Dimension(79, 27));
					jLabel1.setForeground(new java.awt.Color(255,255,255));
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2, new AnchorConstraint(157, 399, 258, 176, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					jLabel2.setText("Level:");
					jLabel2.setFont(new java.awt.Font("URW Chancery L",1,20));
					jLabel2.setPreferredSize(new java.awt.Dimension(59, 30));
					jLabel2.setForeground(new java.awt.Color(255,255,255));
				}
				{
					comboLevel = new JComboBox();
					getContentPane().add(comboLevel, new AnchorConstraint(153, 884, 244, 429, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					comboLevel.setFont(new java.awt.Font("URW Chancery L",0,16));
					comboLevel.setEditable(true);
					comboLevel.setPreferredSize(new java.awt.Dimension(120, 27));
					comboLevel.setForeground(new java.awt.Color(0,0,0));
					comboLevel.setBackground(new java.awt.Color(255,255,255));
					getContentPane().setBackground(new java.awt.Color(110,180,204));
				}
				{
					scpScores = new JScrollPane();
					getContentPane().add(scpScores, new AnchorConstraint(325, 941, 799, 78, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					scpScores.setFont(new java.awt.Font("URW Gothic L",0,16));
					scpScores.setOpaque(false);
					scpScores.setBackground(new java.awt.Color(255,255,255));
					scpScores.setPreferredSize(new java.awt.Dimension(214, 117));
					{
						tableScores = new JTable();
						tableScores.setFont(new java.awt.Font("URW Gothic L",0,14));
						scpScores.setViewportView(tableScores);
						
					}
				}
				{
					bntExit = new JButton();
					getContentPane().add(bntExit, new AnchorConstraint(823, 957, 957, 574, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL, AnchorConstraint.ANCHOR_REL));
					bntExit.setText("Exit");
					bntExit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("picture/exit.png")));
					bntExit.setBackground(new java.awt.Color(255,255,255));
					bntExit.setFont(new java.awt.Font("URW Gothic L",0,15));
					bntExit.setPreferredSize(new java.awt.Dimension(95, 33));
				}

			}
			pack();
			this.setSize(258, 277);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public JTable getTableScores() {
		return tableScores;
	}

	public void setTableScores(JTable tableScores) {
		this.tableScores = tableScores;
	}
		
	
	public void addListener(ActionListener actionListener) {
		this.bntExit.addActionListener(actionListener);
		this.comboLevel.addActionListener(actionListener);
	}
	
	
	public JComboBox getComboLevel() {
		return comboLevel;
	}
	
	
	public void setComboLevel(List<String> levels)
	{
		ComboBoxModel modelo = new DefaultComboBoxModel(levels.toArray());
		comboLevel.setModel(modelo);
    }
	
	public void setResultados(AbstractTableModel abstractTableModel) {
		tableScores.setModel(abstractTableModel);
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}

}
