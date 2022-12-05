package com.coding.problems.others.streams.Design.signalton;


//Lazy Initalization + Thrad Safe 
public class Singleton4 {
	private static Singleton4 instance = null;

	private Singleton4() {
	}

	public static synchronized Singleton4 getInstance() {
		try {
			if (instance == null) {
				instance = new Singleton4();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
}
