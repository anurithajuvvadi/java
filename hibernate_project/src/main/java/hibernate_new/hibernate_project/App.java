package hibernate_new.hibernate_project;

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
    public static void main( String[] args )
    {
        System.out.println("hibernate project");
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        //System.out.println(session);
        //save my dta to db
        //create object of student class
        //student s1=new student();
        //s1.setSid(1);
        //s1.setSname("anu");
        //s1.setScity("hyd");
        address a=new address();
        a.setAddressid(1);
        a.setCity("hyd");
        a.setStreet("alwal");
        a.setX(34.5);
        a.setIsopen(true);
        a.setAddeddate(new Date());
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        //session.save(s1);
        session.save(a);
        
        // code to get the data from db and display here
        address ad1=session.get(address.class,1);//here 1 is the id value in table
        System.out.println(ad1);
        System.out.println(ad1.getAddressid()+ad1.getCity());
// if we write same code again also to fetch same data, select stamt will not be executed twice and data will be displayed twice
        tx.commit();
        session.close();
        System.out.println("data saved");
        
        
        
        
    }
}
