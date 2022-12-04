package testing.DurgaSir.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseOrderStringTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> c = (s1,s2)-> -s1.compareTo(s2);
		
		TreeSet<String> t = new TreeSet(c);
		t.add("Nilesh");
		t.add("Harshu");
		t.add("Yogesh");
		t.add("Ashok");
		
		System.out.println(t);
		
	}

}
