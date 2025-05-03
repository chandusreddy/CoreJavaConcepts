package com.chandu.core.java.AbstractClassDemoWhentouseApp;

public class AbstractClassTest
{

	public static void main(String[] args)
	{
		Car carRef = new HondaCar();
		carRef.engine();
		
		carRef = new SwiftCar();
		carRef.engine();
	}

}
