package com.main;

import com.service.Car;

public class CarMain {
public static void main(String[] args) {
		
		Car car =  new Car("BMW", "2024", 30000);
		
		System.out.println(car.hashCode());

		System.out.println("=============");
		
		
	Car car2 = new Car("BMW", "2022", 30000);
	System.out.println(car2.hashCode());
	
	String name = "Sarita";
	System.out.println(name.hashCode());
	
	String name2 = "Sarita";
	System.out.println(name2.hashCode());
	
	
	
}
}
