package testing.DurgaSir.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList  l = new ArrayList();
		l.add("Y");
		l.add("P");
		l.add("Z");
		l.add("C");
		l.add("A");
		System.out.println("Before Sorting :"+l);
		Collections.sort(l);  //D.N.S.O
		System.out.println("After Sorting"+l);
		
	}

}
