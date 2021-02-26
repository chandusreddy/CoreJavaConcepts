package com.chandu.core.java.abstraction;

public class Rectangle extends Shape {
	
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

	// Rectangle Implementation of the Abstract method CalculateArea from Shape
	// Class.
	@Override
	public double calculateArea() {
		return length * breadth;
	}

	
}
