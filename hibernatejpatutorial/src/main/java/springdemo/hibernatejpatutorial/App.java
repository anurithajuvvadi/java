package springdemo.hibernatejpatutorial;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
     	
       	Employee1 e=new Employee1();
//        	//e.setId(1); //this is commented bcoz this is mentioned as auto field and therefore we dnt have to give valueto it explicitly
        e.setEname("anurithajuvvadi");//the foll 3 lines shld be commented when we try to do find method and then setsalary method nothing but update
       	e.setSalary(23456);
    	e.setDegree("IT");
    	em.persist(e);
    	List<Employee1> emplist=new ArrayList();
    	emplist.add(e);
    }
}
