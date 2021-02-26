package com.chandu.core.java.shallowcopyconstructor;

public class Employee {

	String name;
	int employeeid;
	Person person;

	public Employee(String name, int employeeid, Person person) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.person = person;
	}

	// copy Constructor
	public Employee(Employee e) {
		super();
		this.name = e.name;
		this.employeeid = e.employeeid;
		this.person = e.person; // Shallow Copy
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
