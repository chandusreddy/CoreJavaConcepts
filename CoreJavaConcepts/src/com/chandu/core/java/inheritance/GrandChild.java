package com.chandu.core.java.inheritance;
//In Multi-Level Inheritance, 
//each class extends only a single class in the form of a multi-level or multi-tiered architecture.
public class GrandChild extends Child {

	public void grandchildmanners() {
		System.out.println("This is from the Grand Child Class");
	}

	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		
		gc.childmanners();
		gc.grandchildmanners();
		gc.parentgoodmanners();

	}

}
