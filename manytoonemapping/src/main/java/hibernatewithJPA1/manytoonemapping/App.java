package hibernatewithJPA1.manytoonemapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App 
{
    public static void main( String[] args ) {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
    
    EntityManager em=emf.createEntityManager();  
  //namedquery -->first write @namedquery in employee.java and then this here
	Query q4=em.createNamedQuery("find by student id");
	q4.setParameter("id", 20);
	List<Student> list3=q4.getResultList();
	for(Student s:list3)
	{
		System.out.println("student details  ..."+s);
	}
      
    em.getTransaction().begin();  
//        Library lib=new Library();  
//        lib.setBid(102);  
// lib.setBname("sql");  
//  em.persist(lib);  
//  
// Student st1=new Student();  
//   //st1.setSid(1);  
//   st1.setSname("anu");  
//   em.persist(st1);
//    st1.setLib(lib);  
// 
//  
//      
//Student st2=new Student();  
 // st2.setSid(2);  
 // st2.setSname("ashritha");  
//   st2.setLib(lib);
//    
// Student st=em.find(Student.class, 1);
//	System.out.println(st.getSid());
//System.out.println(st.getSname());
//st.setSname("Krithya");
//  //em.remove(st) ; 
//      
      
  // em.persist(st2);  
//      
   
    em.getTransaction().commit();  
    em.close();  
    emf.close();  
    
    }
}
