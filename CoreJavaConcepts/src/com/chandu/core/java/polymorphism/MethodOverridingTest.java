package com.chandu.core.java.polymorphism;

public class MethodOverridingTest {
	public static void main(String[] args) {
		//Developer class and Manager class have different bonus 
		//so we need different implementation for both using the getSalary method from Employee class.
		
		Developer d1 = new Developer(1, "chandu", 200000);
		Developer d2 = new Developer(2, "Reddy", 250000);
		Manager m1 = new Manager(1, "Chandu", 4000000);
		Manager m2 = new Manager(2, "Reddy", 6000000);

		System.out.println("Name of Employee:" + d1.getEmployeeName() + "---" + "Salary:" + d1.getSalary());
		System.out.println("Name of Employee:" + d2.getEmployeeName() + "---" + "Salary:" + d2.getSalary());
		System.out.println("Name of Employee:" + m1.getEmployeeName() + "---" + "Salary:" + m1.getSalary());
		System.out.println("Name of Employee:" + m2.getEmployeeName() + "---" + "Salary:" + m2.getSalary());
	}

}
