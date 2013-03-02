package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.data.Level;
import modelo.data.Player;
import modelo.dao.*;
import vista.*;

public class ControladorScore implements ActionListener{
	
    private VScore viewScore;
	
    public ControladorScore()
	{
		super();
		
		this.viewScore = new VScore();
		this.viewScore.addListener(this);
		viewScore.setLocationRelativeTo(null);
		this.viewScore.setVisible(true);
		loadLevel();
		this.viewScore.getComboLevel().setSelectedIndex(0);	
	}
    
    public ControladorScore(int id)
	{
		super();
		
		this.viewScore = new VScore();
		this.viewScore.addListener(this);
		viewScore.setLocationRelativeTo(null);
		this.viewScore.setVisible(true);
		loadLevel();
		this.viewScore.getComboLevel().setSelectedIndex(id);	
	}
	
	/****************************** CARGAR COMBO ************************************/
	private void loadLevel()
	{
		
		ScoreDAO DAO = new ScoreDAO();
		List<Level> levels = DAO.searchLevel();
		
		ArrayList<String> listLevels = new ArrayList<String>();
		
		
		for(int i = 0;i < levels.size();i++)
				listLevels.add(levels.get(i).getName());
		
		this.viewScore.setComboLevel(listLevels);		

	}

    private void loadScores()
    {
    	ScoreDAO DAO = new ScoreDAO();
    	List<Player> players = DAO.searchPlayer();
    	List<Player> playersByLevel = new ArrayList<Player>();
		
		for(int i = 0;i < players.size();i++)
			if(players.get(i).getCodlevel() == (this.viewScore.getComboLevel().getSelectedIndex() + 1))
				playersByLevel.add(players.get(i));
				
		this.viewScore.setResultados(new ModelTable(playersByLevel));		

}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Exit"))
			this.viewScore.dispose();
		else if(e.getSource() == this.viewScore.getComboLevel())
			loadScores();
	
		
	
	}

}
