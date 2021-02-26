package com.chandu.core.java.deepcopyconstructor;

public class Person {

	String firstName;

	String lastName;

	// Copy Constructor to use in the Employee class for Deep CopyConstructor.
	public Person(Person p) {
		this.firstName = p.firstName;
		this.lastName = p.lastName;

	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
