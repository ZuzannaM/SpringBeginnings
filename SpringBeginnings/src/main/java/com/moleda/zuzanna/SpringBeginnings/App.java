package com.moleda.zuzanna.SpringBeginnings;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		// ERROR bean id="parentTriangle" is defined abstract
		//Triangle triangle2 = (Triangle) context.getBean("parentTriangle");
		//triangle2.draw();
		
		
		
	}
}
