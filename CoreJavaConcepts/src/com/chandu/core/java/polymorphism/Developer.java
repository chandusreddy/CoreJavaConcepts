package com.chandu.core.java.polymorphism;

public class Developer extends Employee {

	public static final double BONUSPERCENT = 0.1;

	public Developer(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}

	public double getSalary() {
		return salary + salary * BONUSPERCENT;

	}
}
