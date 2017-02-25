package com.moleda.zuzanna.SpringBeginnings;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

//	@Required
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="point2")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("circle.drawing", null, "default", null));
		System.out.println(this.messageSource.getMessage("circle.point", new Object[] {center.getX(), center.getY()}, "default", null));
//		System.out.println("Center point of circle: (" + center.getX() + ", " + center.getY() + ")");
		System.out.println(this.messageSource.getMessage("greeting", null, "default", null));
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
