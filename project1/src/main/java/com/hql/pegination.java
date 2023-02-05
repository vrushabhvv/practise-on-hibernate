package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import project1.Student;

public class pegination {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	
	Query query = session.createQuery("from Student");
	
	//implement pegination
	
	
	query.setFirstResult(0);
	query.setMaxResults(1);
	
	List<Student> list = query.list();
	for(Student st:list) {
		System.out.println(st.getId()+":"+st.getName()+":"+st.getCity());
	}
	
}
}
