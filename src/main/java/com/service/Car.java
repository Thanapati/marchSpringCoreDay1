package com.service;

import java.util.Objects;

public class Car {
	private String model;
	private String year;
	private int price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String model, String year, int price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		
		//this is second commit
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, price, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price && Objects.equals(year, other.year);
	}
	

}
