package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		System.out.println("beanFactory created");
		
		Triangle triangle1 = (Triangle) factory.getBean("triangle");
		Triangle triangle2 = (Triangle) factory.getBean("triangle");
		
		triangle1.draw();
		
		System.out.println(triangle1);
		System.out.println(triangle2);
		
		
//		triangle.draw();

	}

}
