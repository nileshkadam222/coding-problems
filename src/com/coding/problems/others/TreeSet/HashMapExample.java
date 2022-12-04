package testing.DurgaSir.TreeSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		m.put(101, "Nilesh");
		m.put(102, "Harshu");
		m.put(103, "Yogesh");
		m.put(104, "Ashok");
		m.put(105, "Ranjana");
		System.out.println("Map :"+m);
		System.out.println(m.put(101, "pooja"));
		Set keys = m.keySet();
		System.out.println("Keys : "+keys);
		Collection values = m.values();
		System.out.println("Values :"+ values);
		Set entrySet = m.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
		}
		System.out.println("New Map :"+m);
	}

}
