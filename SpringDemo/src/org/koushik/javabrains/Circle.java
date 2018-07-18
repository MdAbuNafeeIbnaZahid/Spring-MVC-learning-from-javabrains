package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Controller
public class Circle implements Shape {

	
	private Point center;
	
	
	
	public Point getCenter() {
		return center;
	}


	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	


	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}



	@Override
	public void draw() {
		System.out.println("Drawing circle ");	
		System.out.println(toString());
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}
}
