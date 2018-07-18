package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle() {
		System.out.println("default constructor of Triangle");
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
	public void myInit() {
		System.out.println("inside myInit method of Triangle");
	}
	
	public void cleanUp() {
		System.out.println("inside my cleanUp method of Triangle");
	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Traingle");
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for the Triangle");
//		
//	}

	

	@Override
	public void draw() {
		System.out.println("Drawing Triangle ");
		System.out.println( toString() );
	}

}
