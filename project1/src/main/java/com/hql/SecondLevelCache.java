package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import project1.Student;

public class SecondLevelCache {
	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session1 = factory.openSession();
		project1.Student student1 = session1.get(Student.class,2);
		System.out.println(student1.getName()); 
		session1.close();

		Session session2 = factory.openSession();
		project1.Student student2 = session1.get(Student.class,2);
		System.out.println(student2.getName());
		session2.close();
	}
}
