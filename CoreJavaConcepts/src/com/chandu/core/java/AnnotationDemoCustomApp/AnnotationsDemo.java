package com.chandu.core.java.AnnotationDemoCustomApp;

@interface MyAnnotation
{
	
} 

public class AnnotationsDemo
{
	@MyAnnotation
	public static void main(String args[])
	{
		System.out.println("Hi Annotation");
	}
}