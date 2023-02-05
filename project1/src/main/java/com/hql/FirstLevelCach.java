package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import project1.Student;

public class FirstLevelCach {
	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		 Student student = session.get(Student.class,2);
	     System.out.println(student); 
	     
	     System.out.println("working something");
	     Student student1 = session.get(Student.class,2);
	     System.out.println(student1); //this is returning empty
		
		
		
		
		
		session.close();
	}
}
