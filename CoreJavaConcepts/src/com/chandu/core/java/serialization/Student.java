package com.chandu.core.java.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * serialVersionUID is used to ensure that same class
	 * (That was used during Serialization) is
	 *  loaded during Deserialization.
	 *  serialVersionUID is used for version control of object.
	 */
	// 
	private static final long serialVersionUID = 1L;

	private int studentId;
	private String studentName;
	private String courseName;
	transient String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
