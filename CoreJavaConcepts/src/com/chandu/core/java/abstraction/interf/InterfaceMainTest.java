package com.chandu.core.java.abstraction.interf;



public class InterfaceMainTest {

	public static void main(String[] args) {
		System.out.println("============================");
		Rectangle rc = new Rectangle(5, 6);
		rc.draw();
		System.out.println("Area of rectangle is " + rc.calculateArea());
		System.out.println("============================");

		Circle cr = new Circle(5);
		cr.draw();
		System.out.println("Area of circle is " + cr.calculateArea());
		System.out.println("============================");
	}

}
