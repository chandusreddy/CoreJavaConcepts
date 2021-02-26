package com.chandu.core.java.shallowcopyconstructor;

//we changed Person  First Name in original object, it got changed in duplicate object too.
//This is because we have done shallow copy in case of Person object, 
//so both objects are referring to same Person reference.You need to be careful 
//while using copy constructor as it may result in unexpected behavior and it is very hard to debug.

public class CopyConstructorMain {

	public static void main(String[] args) {

		// Create person Object
		Person person = new Person("Chandu", "Reddy");
		// Create Employee Object
		Employee employee = new Employee("Chandu Reddy", 101, person);

		// Using the copy constructor to create the duplicate Object.
		Employee employeeCopyObject = new Employee(employee);

		System.out.println("Employee name of the Copied Object:" + employeeCopyObject.getName());

		System.out.println("Employee Id of the Copied Object:" + employeeCopyObject.getEmployeeid());

		System.out.println("Person FirstName of the Copied Object:" + employeeCopyObject.getPerson().firstName);

		System.out.println("Person LastName Id of the Copied Object:" + employeeCopyObject.getPerson().lastName);

		System.out.println("============================================");

		// Changing Person name of original object

		employee.getPerson().setFirstName("Chanduuu");

		System.out.println("Person FirstName of the Original Object:" + employee.getPerson().firstName);

		System.out.println("Person FirstName of the Copied Object:" + employeeCopyObject.getPerson().firstName);

	}

}

/* Output
Employee name of the Copied Object:Chandu Reddy
Employee Id of the Copied Object:101
Person FirstName of the Copied Object:Chandu
Person LastName Id of the Copied Object:Reddy
============================================
Person FirstName of the Original Object:Chanduuu
Person FirstName of the Copied Object:Chanduuu
 * 
 * */
 