package com.chandu.core.java.loops;

public class IfElseExample {

	public void checkOddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

	public static void main(String[] args) {
		IfElseExample obj = new IfElseExample();
		obj.checkOddOrEven(20);
	}

}
