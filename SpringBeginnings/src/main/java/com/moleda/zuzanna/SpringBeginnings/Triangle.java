package com.moleda.zuzanna.SpringBeginnings;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{

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

	public void draw() {
		System.out.println("PointA = ( " + getPointA().getX() + ", " + getPointA().getY() + " )");
		System.out.println("PointB = ( " + getPointB().getX() + ", " + getPointB().getY() + " )");
		System.out.println("PointC = ( " + getPointC().getX() + ", " + getPointC().getY() + " )");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called by Triangle");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called by Triangle");
	}
	
	public void myInit(){
		System.out.println("MyInit method called by Triangle");
	}
	
	public void cleanUp(){
		System.out.println("CleanUp method called by Triangle");
	}
}
