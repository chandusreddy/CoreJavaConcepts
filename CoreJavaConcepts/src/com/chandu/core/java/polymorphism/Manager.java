package com.chandu.core.java.polymorphism;

public class Manager extends Employee {
	public static final double BONUSPERCENT = 0.2;

	public Manager(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}

	public double getSalary() {
		return salary + salary * BONUSPERCENT;
	}

}
