package com.chandu.core.java.CommandLinArgsDemo;

public class Echo
{
	public static void main(String[] args)
	{
		for (String s : args)
		{
			System.out.println(s);
		}
	}
}