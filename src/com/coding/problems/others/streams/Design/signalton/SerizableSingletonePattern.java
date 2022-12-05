package com.coding.problems.others.streams.Design.signalton;

import java.io.Serializable;

public class SerizableSingletonePattern implements Serializable {

	private static SerizableSingletonePattern INSTANCE = null;
	
	private SerizableSingletonePattern() {
		
	}
	
	public static SerizableSingletonePattern getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SerizableSingletonePattern();
		}
		return INSTANCE;
	}
	
	public Object readResolve(){
		return  getInstance();
	}
	
}
