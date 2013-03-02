package modelo.dao;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import modelo.data.Player;
import modelo.hibernate.HibernateSessionFactory;

public class PlayerDAO {
	
	
	public void registrarPlayer(Player player) {
		
		Session session = HibernateSessionFactory.getSession();
		session.save(player);
		session.flush();
		session.close();
	}

}
