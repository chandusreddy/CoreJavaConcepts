package com.chandu.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserializationTest {

	public static void main(String[] args) {
		Student st = null;

		FileInputStream fis;
		try {
			fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			st = (Student) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Student Class not found: ");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Student Object! ");
		System.out.println("Student ID: " + st.getStudentId());
		System.out.println("Student Name: " + st.getStudentName());
		System.out.println("Student Course: " + st.getCourseName());
		// Default value will be stored for the Transient variables and it is not
		// serialized when declared as Transient.
		System.out.println("Student Grade : (Transient) - Default Value will be return:  " + st.getGrade());

	}

}
