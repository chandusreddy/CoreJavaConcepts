package com.chandu.core.java.AccessModifiersDemoMethodApp.mypack2;

import com.chandu.core.java.AccessModifiersDemoMethodApp.mypack1.Student;

public class PreKgStudent extends Student
{

	public void displayHello()
	{
		display();
	}

	public static void main(String[] args)
	{
		PreKgStudent preKgStudent = new PreKgStudent();
		preKgStudent.display();	
	}

}
