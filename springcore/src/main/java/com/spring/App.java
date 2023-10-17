package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Student s=(Student) context.getBean("student1");
    	Student s1=(Student) context.getBean("student2");
    	System.out.println(s);
    	System.out.println(s1);
    	
    	
    }
    
}
