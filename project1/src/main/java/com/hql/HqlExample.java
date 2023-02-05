package com.hql;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import project1.Student;

public class HqlExample {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		//HQL
		//Syntax
		
		String query="from Student as s where s.city=:m and s.name=:name";//you can give dynamic value
		Query q1 = session.createQuery(query);
		q1.setParameter("m", "kanpur");
		q1.setParameter("name", "ramesh");
		
		//there are multiple ways how to access the object
		//if you are accesing single object then use respective method,uniqueResult()
		//if you accesing multiple object then use list method
		
		List<Student> list = q1.list();
		for(Student student:list) {
			System.out.println(student.getName()+":"+student.getCertificate().getCourse());
		}
		
		Transaction tx=session.beginTransaction();
		System.out.println("-------------------------------------");
		//delete query
//		Query q2 = session.createQuery("delete from Student as s where s.city=:c");
//		q2.setParameter("c", "delhi");
//		int n = q2.executeUpdate();
//		System.out.println("deleted:");
//		System.out.println(n);
		
		//update query
//		Query q3 = session.createQuery("update Student set city=:c where name=:n");
//		q3.setParameter("c", "noyada");
//		q3.setParameter("n", "peter");
//		int n = q3.executeUpdate();
//		System.out.println("updated");
//		System.out.println(n+" updated objects");
		
		//join query
		Query q2 = session.createQuery("select q.questionId,q.question,a.answer from Question as q inner join q.answer as a");
		
		List<Object[]> list3 = q2.getResultList();
		for(Object[] arr:list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		
		
		
		
		
		
		session.close();
		
		
		
	}
	
	
	
	
	

	
}
