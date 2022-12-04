package testing.DurgaSir.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}

public class CollectionsSortDemo2 {
	
	static Comparator<String> c = (s1,s2)->-s1.compareTo(s2);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("F");
		list.add("E");
		list.add("Z");
		list.add("X");
		System.out.println("List Before Sorting :"+list);
		//Collections.sort(list, new MyComparator());
		Collections.sort(list,c);
		System.out.println("List After Sorting :"+list);
		System.out.println("Successfull Search :"+Collections.binarySearch(list, "F", c));
		System.out.println("unsuccessfull Search :"+Collections.binarySearch(list, "l", c));
	}

}
