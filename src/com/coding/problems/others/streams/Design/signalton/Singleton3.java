package com.coding.problems.others.streams.Design.signalton;

//Lazy Initalization
public class Singleton3 {
	private static Singleton3 instance = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		try {
			if (instance == null) {
				instance = new Singleton3();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
}
