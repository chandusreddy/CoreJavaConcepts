package com.chandu.core.java.immutable;

import java.util.ArrayList;

public final class ImmutableClass {
	private final String employeeName;
	private final ArrayList<String> listofJobs;

	public ImmutableClass(String employeeName, ArrayList<String> listofJobs) {
		super();
		this.employeeName = employeeName;
		// this.listofJobs = listofJobs;
		// Creating deep copy for mutable object
		ArrayList<String> templist = new ArrayList<>();
		for (int i = 0; i < listofJobs.size(); i++) {
			templist.add((String) listofJobs.get(i));
		}
		this.listofJobs = templist;
	}

	public String getEmployeeName() {
		// Do not need to do cloning as it is immutable object
		return employeeName;
	}

	public ArrayList<String> getListofJobs() {
		// return listofJobs;
		// Returning cloned object
		return (ArrayList<String>) listofJobs.clone();
	}

	public static void main(String[] args) {
		ArrayList<String> listofJobs = new ArrayList<>();
		listofJobs.add("Design");
		listofJobs.add("Development");
		listofJobs.add("Code review");
		listofJobs.add("Testing");

		ImmutableClass im = new ImmutableClass("Chandu", listofJobs);
		System.out.println("Employee : " + im.getEmployeeName());
		System.out.println("List of Jobs : " + im.getListofJobs());
		// It will not be added to the list because we used clone in getListofJobs
		im.getListofJobs().add("Deploy");
		// It will be added to the list because we used deep copy in constructor
		listofJobs.add("Go-Live");
		System.out.println("Updated List of Jobs : " + im.getListofJobs());

	}

}
