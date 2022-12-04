package testing.DurgaSir.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("L");
		l.add("W");
		l.add("X");
		l.add("P");
		
		System.out.println("After Sorting :"+l);
		Collections.sort(l);
		System.out.println("Before Sorting :"+l);
		int index = Collections.binarySearch(l, "P");
		System.out.println("Success full search :"+index);
	    int index2 = Collections.binarySearch(l, "g");
		System.out.println("Unsuccess full serach :"+index2);
		

	}

}
