package com.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping1.Answer;
import com.mapping1.Question;

public class cascading {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1=new Question();
		q1.setQuestionId(1241);
		q1.setQuestion("what is swing framework");
		
		Answer a1=new Answer();
		a1.setAnswerId(1242);
		a1.setAnswer("used for developement");
		Answer a2=new Answer();
		a2.setAnswerId(1243);
		a2.setAnswer("desktop");
		Answer a3=new Answer();
		a3.setAnswerId(1245);
		a3.setAnswer("learn by programmers");
		List<Answer> list=new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		
		Transaction tx= session.beginTransaction();
		session.save(q1);
		//error coming here ,i have implemented casceding in another file
		
		tx.commit();
		
		
		
		
		
		session.close();
	}

}
