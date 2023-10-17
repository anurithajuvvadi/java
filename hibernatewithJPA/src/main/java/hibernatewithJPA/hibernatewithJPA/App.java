package hibernatewithJPA.hibernatewithJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
    	
    	//scalar function
    	/*Query q=em.createQuery("select UPPER(e.ename)from Employee e");//when are doing this jpql i.e. sacalar function comment from em.gettransaction till commit line and run only till for loop
    	List<String> list=q.getResultList();
    	for(String s:list)
    	{
    		System.out.println("employee names are ..."+s);
    	}
    	
    	
    	//aggregate function
    	Query q1=em.createQuery("select max(e.salary) from Employee e");//when we are doing this aggregate function write these three lines 
    	Double d=(Double)q1.getSingleResult();
    	System.out.println("max salary is ..."+d);
    	
    	
    	// name starts with a
    	Query q2=em.createQuery("select e.ename from Employee e where e.ename like 'a%'");
    	List<String> list1=q2.getResultList();
    	for(String s:list1)
    	{
    		System.out.println("employee names with a are ..."+s);
    	}
    	
    	
    	//show details according name in desc order
    	Query q3=em.createQuery("select e.ename from Employee e order by ename desc");
    	List<String> list2=q3.getResultList();
    	for(String s:list2)
    	{
    		System.out.println("employee names in ordered way are ..."+s);
    	}
    	
    	
    	//namedquery -->first write @namedquery in employee.java and then this here
    	Query q4=em.createNamedQuery("find by employee id");
    	q4.setParameter("id", 1);
    	List<Employee> list3=q4.getResultList();
    	for(Employee s:list3)
    	{
    		System.out.println("employee details  ..."+s);
    	}
    	
    	
    	
    	//criteria query
    	CriteriaBuilder cb=em.getCriteriaBuilder();
    	CriteriaQuery<Object> cq=cb.createQuery();
    	Root<Employee> r=cq.from(Employee.class);
    	System.out.println("to select all records");
    	CriteriaQuery<Object> select=cq.select(r);
    	
    	CriteriaQuery<Object> select1=cq.select(r);//these three lines for another query for order by example.comment these 3 lines when running initially for normal program
    	select1.orderBy(cb.asc(r.get("ename")));
    	TypedQuery<Object> type=em.createQuery(select1);
    	
    	
    	//sal greater than 20000
    	CriteriaQuery<Object> select2=cq.select(r);//these three lines for another query for order by example.comment these 3 lines when running initially for normal program
    	//select2.where(cb.greaterThan(r.get("salary"),20000));
    	//TypedQuery<Object> type=em.createQuery(select);
    	List<Object> result=type.getResultList();
    	for(Object o:result) {
    		Employee e=(Employee) o;
    		System.out.println("employee id"+e.getId());
    		System.out.println("employee name"+e.getEname());
    		
    		
    	}
    	
    	*/
 	em.getTransaction().begin();
 	Department d=new Department();
	d.setDname("IT");
   	Employee e=new Employee();
//    	//e.setId(1); //this is commented bcoz this is mentioned as auto field and therefore we dnt have to give valueto it explicitly
    	//e.setEname("anuritha");//the foll 3 lines shld be commented when we try to do find method and then setsalary method nothing but update
   	e.setSalary(67890);
	e.setDegree("cse");
	e.setDept(d);
	
	
//    	
    	
//    	//Employee emp=em.find(Employee.class, 1);//the foll lines till setsalary line has to be commneted when we are trying to insert the values for the first time
//    	System.out.println(emp.getEname());
//    	System.out.println(emp.getDegree());
//    	System.out.println(emp.getSalary());
//    	emp.setSalary(45678);//when we are updating the value by setsalary to new value first we have to do find method with 1 as primary key  and for that row we are updating the salary by setsalary as 45678 
    	em.persist(e);
    	em.persist(d);
    	em.getTransaction().commit();
    	em.close();
    	emf.close();
    	
    }
}
