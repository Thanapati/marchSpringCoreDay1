package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Car;

public class SpringCarMainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
		
		Car c = (Car) applicationContext.getBean("car");
		
		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println("=================");
		
		
		Car c2 = (Car) applicationContext.getBean("car");
		System.out.println(c2);
		System.out.println(c2.hashCode());
		
		
		
		
		
	}

}
