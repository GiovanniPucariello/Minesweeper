package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.data.Player;


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
public class ModelTable extends AbstractTableModel {

	private static String[] titulos = {"  Name   ", "  Score  "};
	private List<Player> players = new ArrayList<Player>();
	
	
	public ModelTable(List<Player> players) {
		super();
		this.players = players;
		this.fireTableDataChanged();
	}

	@Override
	public int getColumnCount() {		
		return titulos.length;
	}

	@Override
	public int getRowCount() {		
		return players.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Player player = players.get(rowIndex);
		switch (columnIndex) 
	    {
			case 0: return player.getName();
			case 1: return String.valueOf(new SimpleDateFormat("mm:ss").format(player.getScore()));
			
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		return titulos[column];
	}
	
	private void initGUI() {
		try {
			{
				this.setSize(307, 122);
				this.setLayout(null);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
