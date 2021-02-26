package com.chandu.core.java.abstraction;

abstract class Shape {

	public void draw() {
		System.out.println("Draw method in shape class");
	}

	// Abstract method is the method which do not have implementation i.e. it does not have anybody
	// Implementation will be provided by the subclasses
	public abstract double calculateArea();

}
