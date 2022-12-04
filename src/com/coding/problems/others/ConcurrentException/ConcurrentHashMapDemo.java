package testing.DurgaSir.ConcurrentException;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101,"Nilesh");
		m.put(102,"Harshu");
		m.put(103,"Yogesh");
		m.putIfAbsent(102, "Pooja");
		m.remove(105, "Harshu");
		m.remove(102, "Harshu");
		m.replace(101, "Nilesh", "Nilesh Kadam");
		System.out.println(m);
	}

}
