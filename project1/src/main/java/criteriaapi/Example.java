package criteriaapi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import project1.Student;

public class Example {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Criteria c=session.createCriteria(Student.class);
		//filter data using restrictions
		//	c.add(Restrictions.eq("certificate.course","Android" ));
		c.add(Restrictions.lt("id",3));

		List<Student> st = c.list();
	
			System.out.println(st);


		session.close();
	}
}
