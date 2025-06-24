package com.chandu.core.java.AutoBoxingNUnBoxing;

public class UnboxingDemo {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer integerObj = new Integer(100);
		int intValue = integerObj; // UnBoxing
		System.out.println(intValue);

		display(integerObj);// UnBoxing
	}

	public static void display(int intValue) {
		System.out.println(intValue);
	}
}