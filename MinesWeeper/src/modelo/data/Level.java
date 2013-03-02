package modelo.data;

import java.io.Serializable;

public class Level implements Serializable {
	private int codlevel;
	private String name;
	
	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Level(int codlevel, String name) {
		super();
		this.codlevel = codlevel;
		this.name = name;
	}

	public int getCodlevel() {
		return codlevel;
	}

	public void setCodlevel(int codlevel) {
		this.codlevel = codlevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
