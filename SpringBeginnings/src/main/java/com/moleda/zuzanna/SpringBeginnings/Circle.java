package com.moleda.zuzanna.SpringBeginnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
		System.out.println("Center point of circle: (" + center.getX() + ", " + center.getY() + ")");

	}

}
