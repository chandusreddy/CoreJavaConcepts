package com.chandu.core.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMainTest {
	
	public static void main(String[] args) {
		
		List<Student>  st = new ArrayList<>();
		st.add(new Student("Sachin",100, 5));
		st.add(new Student("Dravid",90, 4));
		st.add(new Student("Shewag",80, 3));
		
		// This work only for String and Primitive Types for sorting for the customized objects, we need to implement Comparable interface
		Collections.sort(st);
		
		// Sorted using comparable by the order of Gpa.
		for(Student s : st) {
			System.out.println(s);
		}
		
	}

}
