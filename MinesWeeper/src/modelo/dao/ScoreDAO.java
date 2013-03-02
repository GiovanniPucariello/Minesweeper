package modelo.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import modelo.data.*;
import modelo.hibernate.HibernateSessionFactory;

public class ScoreDAO {
	
	public List consultarHQL(String hql) 
	{
		Session session = HibernateSessionFactory.getSession();
		 // creamos un objeto
		Transaction tx = session.beginTransaction();
		// transsacion necesario
		// para ejecutar una accion
		List lista = session.createQuery(hql).list();
		tx.commit();
		session.close();
		return lista;
	}
	
	public List<Level> searchLevel()
	{
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Level.class);
		criteria.addOrder(Order.asc("codlevel"));
		
		return criteria.list();
	}
	
	public List<Player> searchPlayer() {
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.addOrder(Order.asc("score"));
		
		return criteria.list();
	}
	
	public void deletePlayer(Player player)
    {
		Session session = HibernateSessionFactory.getSession();
		session.delete(player);
		session.flush();
		session.close();
    }

}
