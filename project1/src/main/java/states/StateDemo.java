package states;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import project1.Certificate;
import project1.Student;

public class StateDemo {
	public static void main(String[] args) {
		//practical on hibernate life cycle
		//transient
		//persistant
		//detached
		//removed
		System.out.println("example");
		
		SessionFactory factory=new Configuration().configure("states/hibernate.cfg.xml").buildSessionFactory();
		Student student=new Student();
		student.setId(1);
		student.setName("peter");
		student.setCity("city");
		student.setCertificate(new Certificate("java hibernate course","2months"));
		//transient state 
		
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		//student persistant state
		
		student.setName("john");
		tx.commit();
		
		session.close();
		student.setName("vinod");
		//student detached state
	}

}
