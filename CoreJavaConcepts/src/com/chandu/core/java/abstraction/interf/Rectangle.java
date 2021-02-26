package com.chandu.core.java.abstraction.interf;

public class Rectangle implements Shape {

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double length;
	double breadth;

	@Override
	public void draw() {
		System.out.println("Rectangle: Implementation of Shape Interface Draw Method");

	}

	// Interface Implementation of Shape
	@Override
	public double calculateArea() {
		return length * breadth;
	}

}
