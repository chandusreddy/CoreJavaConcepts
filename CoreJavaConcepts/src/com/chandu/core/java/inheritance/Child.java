package com.chandu.core.java.inheritance;

//Single Inheritance
//This is the simplest form of inheritance in Java and is a simple ONE to ONE relationship between two classes.

public class Child extends Parent {
	
	public void childmanners() {
		System.out.println("This is from the Child Class");
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.parentgoodmanners();
	}
	

}
