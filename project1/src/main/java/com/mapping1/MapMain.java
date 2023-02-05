package com.mapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("com/mapping1/hibernate.cfg.xml").buildSessionFactory();
		
//		creating question
		Question q1=new Question();
//		q1.setQuestionId(1212);
		q1.setQuestion("what is java?");
//		
//		//creating multiple answer
		Answer answer=new Answer();
//		answer.setAnswerId(343);
		answer.setAnswer("java is programing language");
		answer.setQuestion(q1);
//		
//		
		Answer answer1=new Answer();
//		answer1.setAnswerId(344);
		answer1.setAnswer("java is programing language used to create software");
		answer1.setQuestion(q1);
//		
		Answer answer2=new Answer();
//		answer2.setAnswerId(345);
		answer2.setAnswer("java is programing language");
		answer2.setQuestion(q1);
//		
////		storing list to arraylist
		List<Answer> list=new ArrayList<>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
//		
//		//set answer
		q1.setAnswer(list);
		
		
		
		
		
		
		
		Session session = factory.openSession();
		
		
		
		
//	
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
//		session.save(answer);
		
		tx.commit();
		
		
		Question q11=(Question) session.get(Question.class,1);
		System.out.println(q11.getQuestion());
		//lazy,it will not throw query until you ask,it is default type
		//when you mention about fetchtype eagar then it will internally load all the answers for this class instantly ,you might dont see any difference here but you have difference intarnally while executing the query
		System.out.println(q11.getAnswer().size());
//		
		for(Answer a:q11.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
	
		session.close();
	}

}

