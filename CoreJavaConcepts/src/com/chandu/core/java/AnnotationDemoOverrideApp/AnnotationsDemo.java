package com.chandu.core.java.AnnotationDemoOverrideApp;

class Animal {
	void eatChicken() {
		System.out.println("Eating 2 chicken legs");
	}
}

class Dog extends Animal {
	@Override
	void eatChicken() {
		System.out.println("Eating 5 chicken legs");
	}
}

public class AnnotationsDemo {
	public static void main(String args[]) {
		Animal animal = new Dog();
		animal.eatChicken();
	}
}