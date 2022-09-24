package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Application {
	public static void main(String[] args) {
		// early
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ioc.xml");
		System.out.println("----------------------------------------------------------");
	
		Test t1=(Test)context.getBean("t1");
		System.out.println(t1);


		Test t2=(Test)context.getBean("t2");
		System.out.println(t2);

	}
}
