package com.chandu.core.java.inheritance;
//Hierarchical Inheritance 
//is a type of inheritance where many sub-classes( Child and New Child Classes) extend a single super-class(Parent Class)
public class NewChild extends Parent {

	public void newchildmanners() {
		System.out.println("This is from the New Child Class");
	}

	public static void main(String[] args) {

		NewChild nc = new NewChild();
		nc.parentgoodmanners();
		nc.newchildmanners();
	}

}
