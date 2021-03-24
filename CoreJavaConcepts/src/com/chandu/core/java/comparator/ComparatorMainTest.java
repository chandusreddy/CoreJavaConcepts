package com.chandu.core.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMainTest {

	public static void main(String[] args) {

		List<Student> st = new ArrayList<>();
		st.add(new Student("Sachin", 100, 5));
		st.add(new Student("Dravid", 90, 4));
		st.add(new Student("Shewag", 80, 3));

		// Using the comparator, when we have a class - Student that doesn't implement
		// comparable or when we want to change the
		// sorting type variable

		// This is the anonymous inner class
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student st1, Student st2) {
				//// if this(first object) > st2(second object) return a +(positive) value
				if (st1.getGpa() > st2.getGpa())
					return 1;
				// if this(first object) < st2(second object) return a -(negative) value
				else
					return -1;

			}

		};

		// Collections have a sort method that can take the collection, comparator.
		Collections.sort(st, com);

		// Sorted using comparable by the order of Gpa.
		for (Student s : st) {
			System.out.println(s);
		}

	}

}
