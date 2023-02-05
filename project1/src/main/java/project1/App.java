package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started" );
        
        //assign object to session factory interface using its implemented class method
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
        
        //we can create in one line 
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();  
        
        //creating student object
//        Student st=new Student();
//        st.setId(2);
//        st.setName("amay");
//        st.setCity("raypur");
//        System.out.println(st);
//        
//        //creating address object
//        Address ad=new Address();
//        ad.setCity("kanpur");
//        ad.setStreet("keral");
//        ad.setOpen(true);
//        ad.setX(1451.1412);
//        ad.setAddedDate(new Date());
//        //reading the image
//        FileInputStream fis=new FileInputStream("src/main/java/img");
//        byte [] data=new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);
        
        

        //opening the session for first time
//        Session session = factory.openSession();
        
        //starting transanction
//        Transaction tx = session.beginTransaction();
        
        //save  student data into table via session
//        session.save(st);
        //save address data into table via session
//        session.save(ad);
        
        //commit the transaction
//        tx.commit();
        //close the session
        
        
        
        
//        project1.Student student1 = session.get(Student.class,2);//single level cache
//        System.out.println(student1.getName());  
//        
//        System.out.println("working something");
//        
//        project1.Student student2 = session.get(Student.class,2);
//        System.out.println(student2.getName()); 
//        System.out.println(session.contains(student2));
        
        Session session1 = factory.openSession();
		project1.Student student1 = session1.get(Student.class,1);
		System.out.println(student1.getName()); 
		session1.close();

		Session session2 = factory.openSession();
		project1.Student student2 = session1.get(Student.class,1);
		System.out.println(student2.getName());
		session2.close();
        
        
        
        
        
//        session.close();
        System.out.println("done");
        
        
    }
}
