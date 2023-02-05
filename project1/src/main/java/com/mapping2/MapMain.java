package com.mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMain {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("com/mapping2/hibernate.cfg.xml").buildSessionFactory();
	
	Emp emp1=new Emp();
	Emp emp2=new Emp();
	
	emp1.seteId(10);
	emp1.setName("Ram");
	emp2.seteId(20);
	emp2.setName("samarth");

	
	
	
	
	Project project1=new Project();
	Project project2=new Project();
	
	project1.setpId(10);
	project1.setProjectName("library system");
	project2.setpId(20);
	project2.setProjectName("chatbot");
	
    List<Emp> list1=new ArrayList<>();
    List<Project> list2=new ArrayList<>();
    
    list1.add(emp1);
    list1.add(emp2);
    
    list2.add(project1);
    list2.add(project2);
    
    emp1.setProject(list2);
    project1.setEmp(list1);
    
    Session session = factory.openSession();
    
    Transaction tx = session.beginTransaction();
    session.save(emp1);
    session.save(emp2);
    session.save(project1);
    session.save(project2);
    
    tx.commit();
    
    session.close();
	
	
	
	

}
}
