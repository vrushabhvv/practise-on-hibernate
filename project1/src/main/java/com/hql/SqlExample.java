package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import project1.Student;

public class SqlExample {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
	Session session=factory.openSession();
	
	String q="select *from Student";
	NativeQuery nq = session.createSQLQuery(q);
	List<Object[]> list = nq.list();
	for(Object[] st:list) {
		System.out.println(Arrays.toString(st));
	}
}
}
