package com.chandu.core.java.comparator;

public class Student {

	private String name;
	private int marks;
	private int gpa;

	public Student(String name, int marks, int gpa) {
		super();
		this.name = name;
		this.marks = marks;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", gpa=" + gpa + "]";
	}

}
