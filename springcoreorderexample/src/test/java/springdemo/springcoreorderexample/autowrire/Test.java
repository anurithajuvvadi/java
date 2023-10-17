package springdemo.springcoreorderexample.autowrire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springdemo/springcoreorderexample/autowrire/config.xml");
	//comment these two when doing factorymethod
	B b=context.getBean("b",B.class);
	b.display();
	
		//comment these two when doing only autowired
	//AA ab=(AA) context.getBean("ab");
	//ab.print();
	
	}

}
