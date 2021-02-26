package com.chandu.core.java.loops;

public class DoWhileLoopExample {

	public String findElementInArr(int arr[], int elementTobeFound) {
		int i = 0;
		do {
			if (arr[i] == elementTobeFound) {
				System.out.println(elementTobeFound + " is present in the array ");
				return "PRESENT";
			}
			i++;
		} while (i < arr.length);

		return "NOT PRESENT";
	}

	public static void main(String[] args) {
		DoWhileLoopExample dwl = new DoWhileLoopExample();
		int arr[] = { 32, 45, 53, 65, 43, 23 };
		System.out.println(dwl.findElementInArr(arr, 53));
	}
}
