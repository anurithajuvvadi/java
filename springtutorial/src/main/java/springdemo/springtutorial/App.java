package springdemo.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	student2 s=(student2) context.getBean("student1");
    	//Student s1=(Student) context.getBean("student2");
    	System.out.println(s);
    	//System.out.println(s1);    
    	}
}

