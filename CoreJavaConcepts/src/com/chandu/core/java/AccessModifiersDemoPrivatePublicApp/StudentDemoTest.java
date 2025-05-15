package com.chandu.core.java.AccessModifiersDemoPrivatePublicApp;

public class StudentDemoTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Dave";
		// cannot access in the other class as its private
		// student.age = 23;
	}

}
