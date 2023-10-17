package springdemo.springusingcollections;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("springdemo/springusingcollections/Configuration.xml");
    	Employee e1=(Employee)context.getBean("emp1");
    }
}
