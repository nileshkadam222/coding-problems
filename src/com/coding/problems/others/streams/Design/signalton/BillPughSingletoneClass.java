package com.coding.problems.others.streams.Design.signalton;

public class BillPughSingletoneClass {

	private BillPughSingletoneClass() {

	}

	private static class SingletoneHolder{
		private static final BillPughSingletoneClass INSTANCE = new BillPughSingletoneClass();
	}

	public static BillPughSingletoneClass getInstance() {
		return SingletoneHolder.INSTANCE;
	}
}
