package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		System.out.println("beanFactory created");
		
		System.out.println("starting of main method");
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("ApplicationContext created");
		
		
		System.out.println("autowire");
		Triangle triangle1 = (Triangle) context1.getBean("triangle");
		Triangle triangle2 = (Triangle) context2.getBean("triangle");
		
		System.out.println( triangle1 );
		System.out.println( triangle2 );
		
	}

}
