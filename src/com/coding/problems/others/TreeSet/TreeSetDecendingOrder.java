package testing.DurgaSir.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Integer> c = (s1, s2) -> (s1 < s2) ? 1 : (s1 > s2) ? -1 : 0;
		TreeSet t = new TreeSet(c);
		t.add(78);
		t.add(54);
		t.add(76);
		t.add(34);
		t.add(12);
		t.add(44);

		System.out.println(t);
	}

}
