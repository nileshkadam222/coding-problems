package com.coding.problems.others.TreeSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m = new HashMap<>();
		m.put(101, "Nilesh");
		m.put(102, "Harshu");
		m.put(103, "Yogesh");
		m.put(104, "Ashok");
		m.put(105, "Ranjana");
		System.out.println("Map :"+m);
		System.out.println(m.put(101, "pooja"));
		Set<Integer> keys = m.keySet();
		System.out.println("Keys : "+keys);
		Collection<String> values = m.values();
		System.out.println("Values :"+ values);
		Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : entrySet) {
            System.out.print(integerStringEntry.getKey() + ": ");
            System.out.println(integerStringEntry.getValue());
        }
		System.out.println("New Map :"+m);
	}

}
