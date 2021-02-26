package com.chandu.core.java.polymorphism;
//Runtime Polymorphism is nothing but method overriding in java.
//If subclass is having same method as base class then it is known as method overriding 
//Or in another word, If subclass provides specific implementation to any method which is present in
//its one of parents classes then it is known as method overriding.

public class RunTimePolymorphism {

	public void draw() {
		System.out.println("Drawing Shape");
	}

	public static void main(String[] args) {
		RunTimePolymorphism s = new RunTimePolymorphism();
		s.draw();
		// JVM will decide based on the runtime object.
		s = new Circle();
		s.draw();
		// JVM will decide based on the runtime object.
		s= new Rectangle();
		s.draw();
	}

}

class Rectangle extends RunTimePolymorphism {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends RunTimePolymorphism {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
