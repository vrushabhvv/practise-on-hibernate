package project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =factory.openSession();
		//transanction is required for when we need to save data
//		Student student = session.get(Student.class,2);
//		System.out.println(student);
////		get() calls select query once if called multiple times,because it will create cache memory from there it take data,if clear the session then again it hit to database
//		Student student1 = session.get(Student.class,2);
//		System.out.println(student1);
		
		Address address =session.load(Address.class, 1);
		//it create object but if we not used to get the data then it will display nothing
		//but object is created,once if used this object to get the data then it return
		//if object is not present 
		//return object not found exception
		System.out.println(address.getCity());
		
		session.close();
	}

}
