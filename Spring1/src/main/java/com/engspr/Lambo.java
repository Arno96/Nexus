package com.engspr;

import java.util.List;

public class Lambo {

public Lambo(int bhp, String name, String maker, String colour, int number,List<String> modelsMade) {
		this.bhp = bhp;
		this.name = name;
		this.maker = maker;
		this.colour = colour;
		this.number = number;
		this.modelsMade = modelsMade;
	}
private int bhp;
private String name;
private String maker;
private String colour;
private int number;
private List<String> modelsMade;
@Override
public String toString() {
	return "Lambo [bhp=" + bhp + ", name=" + name + ", maker=" + maker + ", colour=" + colour + ", number=" + number
			+ ", modelsMade=" + modelsMade + "]";
}



}
