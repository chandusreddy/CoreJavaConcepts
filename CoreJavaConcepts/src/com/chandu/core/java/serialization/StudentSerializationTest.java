package com.chandu.core.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializationTest {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Sachin");
		st.setCourseName("Cricket");

		try {
			FileOutputStream ios = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(ios);
			oos.writeObject(st);
			System.out.println("Serializing the Student Object");
			oos.close();
			ios.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
