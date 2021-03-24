package com.chandu.core.java.comparable;

public class Student implements Comparable<Student> {

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
	public int compareTo(Student st2) {

		// if this(first object) > st2(second object) return a +(positive) value
		if (this.getGpa() > st2.getGpa())
			return 1;
		else
			// if this(first object) < st2(second object) return a -(negative) value
			return -1;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", gpa=" + gpa + "]";
	}

}
