package testing.DurgaSir.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println("Before Reverse List : "+l);
		Collections.reverse(l);
		System.out.println("After Reverse List : "+ l);
		
	}

}
