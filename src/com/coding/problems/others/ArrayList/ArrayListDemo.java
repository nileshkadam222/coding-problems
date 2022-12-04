package testing.DurgaSir.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(20);
		l.add("A");
		l.add(55);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "H");
		l.add("M");
		System.out.println(l);
	}
}
