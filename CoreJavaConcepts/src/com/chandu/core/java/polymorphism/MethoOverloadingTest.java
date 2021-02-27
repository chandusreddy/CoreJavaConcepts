package com.chandu.core.java.polymorphism;

public class MethoOverloadingTest {

	public void printSalary(int salary) {
		System.out.println("Salary with out Bonus : " + salary);

	}

	public void printSalary(int salary, double bonus) {
		System.out.println("Salary with Bonus : " + (salary + bonus));

	}

	public void printSalary(double salary) {
		System.out.println("Salary without bonus : " + salary);

	}

	public static void main(String args[]) {

		MethoOverloadingTest mt1 = new MethoOverloadingTest();
		// if no bonus provided, we can use this method
		// will call printSalary(int)
		mt1.printSalary(20000);
		MethoOverloadingTest mt2 = new MethoOverloadingTest();
		// will call printSalary(double)
		mt2.printSalary(30000.5);
		System.out.println("**********************");
		// If bonus provided we can pass to overloaded method and add to salary
		mt1.printSalary(20000, 10000);
	}

}
