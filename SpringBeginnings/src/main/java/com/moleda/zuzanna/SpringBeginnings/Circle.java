package com.moleda.zuzanna.SpringBeginnings;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	
	private Point point2;

	public Point getCenter() {
		return point2;
	}

//	@Required
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="zeroPoint")
	public void setCenter(Point center) {
		this.point2 = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
		System.out.println("Center point of circle: (" + point2.getX() + ", " + point2.getY() + ")");

	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("Initialization of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}

}
