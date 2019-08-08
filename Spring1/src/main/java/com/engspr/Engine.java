package com.engspr;

public class Engine {
public Engine(int cc, String make) {
		this.cc = cc;
		this.make = make;
	}
private int cc;
private String make;
@Override
public String toString() {
	return "Engine [cc=" + cc + ", make=" + make + "]";
}

}
