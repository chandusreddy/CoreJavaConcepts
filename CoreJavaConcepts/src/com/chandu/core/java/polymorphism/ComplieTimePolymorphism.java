package com.chandu.core.java.polymorphism;

//Compile time Polymorphism is nothing but method overloading in java. 
//You can define various methods with same name but different method arguments.

public class ComplieTimePolymorphism {

	public void test(int a) {
		System.out.println("Integer: " + a);
	}

	public void test(double b) {
		System.out.println("Double " + b);
	}

	public void test(int a, int b) {
		System.out.println("Integer a and b:" + a + " " + b);
	}

	public static void main(String args[]) {
		ComplieTimePolymorphism moe = new ComplieTimePolymorphism();
	
		moe.test(20);
		moe.test(30.0);
		moe.test(20, 30);
	}
}
