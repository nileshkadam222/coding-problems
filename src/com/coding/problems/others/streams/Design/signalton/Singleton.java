package com.coding.problems.others.streams.Design.signalton;


//Egar initalization
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
