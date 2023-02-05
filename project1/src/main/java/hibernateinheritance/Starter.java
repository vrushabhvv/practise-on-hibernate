package hibernateinheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Starter {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernateinheritance/hibernate.cfg.xml").buildSessionFactory();
		
		IndianTeam rahul=new IndianTeam("rahul","dravid");
		
		
		Batsman dhoni=new Batsman("right",183);
		Batsman virat=new Batsman("right",183);
		Batsman ganguly=new Batsman("left",154);
		Batsman raina=new Batsman("left",140);
		
		
		
		
		Bowler nehara=new Bowler("left","6/28");
		Bowler jahir=new Bowler("left","5/41");
		Bowler shami=new Bowler("right","4/52");	
		Bowler jadeja=new Bowler("left","6/70");
		
		Session session = factory.openSession();
		
		
		
		Transaction tx = session.beginTransaction();
		session.save(rahul);
		session.save(dhoni);
		session.save(virat);
		session.save(ganguly);
		session.save(raina);
		session.save(nehara);
		session.save(jahir);
		session.save(shami);
		session.save(jadeja);
		
		
		tx.commit();
		
		
		session.close();
	}
}
