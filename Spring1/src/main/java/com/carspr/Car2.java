package com.carspr;

public class Car2 {
public Car2(String maker, String colour, int number) {
		this.maker = maker;
		this.colour = colour;
		this.number = number;
	}
private String maker;
private String colour;
private int number;
@Override
public String toString() {
	return "Car2 [maker=" + maker + ", colour=" + colour + ", number=" + number + "]";
}

}
