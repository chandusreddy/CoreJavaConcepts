package com.chandu.core.java.abstraction;

public class Circle extends Shape {

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

	// Circle Implementation of the Abstract method CalculateArea from Shape
	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;

	}

}
