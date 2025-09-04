package com.chandu.core.java.SingletonDemo;

public class SingletonApp {

	private static SingletonApp instance;

	private SingletonApp() {
	};

	private static synchronized SingletonApp getInstance() {
		if (instance == null) {
			instance = new SingletonApp();
		}
		return instance;
	}

	public void log(String message) {
		System.out.println("Printing the message" + message);
	}

	public static void main(String[] args) {

		SingletonApp instance = SingletonApp.getInstance();
		instance.log("Singleton App Started.");

	}

}
