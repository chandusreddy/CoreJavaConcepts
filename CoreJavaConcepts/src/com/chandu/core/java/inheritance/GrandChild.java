package com.chandu.core.java.inheritance;
//In Multi-Level Inheritance, 
//each class extends only a single class in the form of a multi-level or multi-tiered architecture.
public class GrandChild extends Child {

	public void grandchildmanners() {
		System.out.println("This is from the Grand Child Class");
	}

	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		// The GrandChild can access the GrandChild methods and its parents(Child) inhertied methods - and any methods that Child can access.
		gc.childmanners();
		gc.grandchildmanners();
		gc.parentgoodmanners();

	}

}
