package com.chandu.core.java.ConstructorDemoPrivateApp;

public class Employee
{

	private String name;
	private int age;

	//private Employee()
	Employee()
	{
		System.out.println("Inside Employee() constructor");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}



}
