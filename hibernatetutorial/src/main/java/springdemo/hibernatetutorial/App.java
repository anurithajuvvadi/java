package springdemo.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("hibernate project");
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(session);
      //create object of student class
        Student1 s1=new Student1();
         s1.setSid(1);
        s1.setSname("anu");
        s1.setScity("hyd");
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);
        tx.commit();
        session.close();
        System.out.println("data saved");
    }
}
