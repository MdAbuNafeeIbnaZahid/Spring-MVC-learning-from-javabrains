package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		System.out.println("beanFactory created");
		
		System.out.println("starting of main method");
		
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		context1.registerShutdownHook();
		
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
//		System.out.println("ApplicationContext created");
		
		
		System.out.println("autowire");
		Shape shape = (Shape) context1.getBean("circle");
		
		shape.draw();
	}

}
