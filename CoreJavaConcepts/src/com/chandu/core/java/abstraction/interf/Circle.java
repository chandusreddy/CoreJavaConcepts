package com.chandu.core.java.abstraction.interf;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Implementation of Shape Interface Draw Method");
	}

	@Override
	public double calculateArea() {
		return  3.14 * radius * radius;
	}

}
