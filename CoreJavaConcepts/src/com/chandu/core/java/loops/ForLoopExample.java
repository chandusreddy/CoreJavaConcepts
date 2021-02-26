package com.chandu.core.java.loops;

public class ForLoopExample {

	public String findElementInArr(int arr[], int elementTobeFound) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementTobeFound) {
				System.out.println(elementTobeFound + " is present in the array ");
				return "PRESENT";
			}
		}
		return "NOT PRESENT";
	}

	public static void main(String[] args) {
		ForLoopExample bse = new ForLoopExample();
		int arr[] = { 32, 45, 53, 65, 43, 23 };
		System.out.println(bse.findElementInArr(arr, 53));
	}

}
