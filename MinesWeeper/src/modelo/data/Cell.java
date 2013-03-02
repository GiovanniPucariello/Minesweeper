package modelo.data;

import javax.swing.JButton;

public class Cell extends JButton{

	private int row;
	private int column;
	private int id;
	private boolean hasFlag;
	
	public Cell() {
		// TODO Auto-generated constructor stub
		super();
		row = column = id = 0;
		hasFlag = false;
	}

	public int getRow() {
		return row;
	}

	public boolean getHasFlag() {
		return hasFlag;
	}

	public void setHasFlag(boolean hasFlag) {
		this.hasFlag = hasFlag;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
