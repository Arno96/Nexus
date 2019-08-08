package com.carspr;

import com.engspr.Engine;

public class Car {
	public Car(int carNumber, Engine engine, String color) {
		this.carNumber = carNumber;
		this.engine = engine;
		this.color = color;
	}
	private int carNumber;
	private Engine engine;
	private String color;
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", engine=" + engine + ", color=" + color + "]";
	}
	

}
