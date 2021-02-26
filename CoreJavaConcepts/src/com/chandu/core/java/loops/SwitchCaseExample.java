package com.chandu.core.java.loops;

public class SwitchCaseExample {
	public static void main(String[] args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break; // It is optional.
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

			// Default is executed when expression does not match with any of above
			// conditions.
		default: // Optional
			System.out.println("Invalid day of week");
		}
	}
}
