package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/mapping/hibernate.cfg.xml").buildSessionFactory();
		
		//creating question
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java?");
		
		//creating answer
		Answer answer=new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is programing language");
		answer.setQuestion(q1);
		
		
		
		q1.setAnswer(answer);
		
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(answer);
		
		tx.commit();
		
		Question newq=(Question)session.get(Question.class,1212);
		System.out.println(newq.getQuestion());
		System.out.println(newq.getAnswer().getAnswer());
		
		session.close();
	}

}
