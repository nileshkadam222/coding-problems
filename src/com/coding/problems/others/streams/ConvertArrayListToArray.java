package testing.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface  
interface A{
	public void m1();
}
@FunctionalInterface
interface B extends A{
	public void m1();
}
public class ConvertArrayListToArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(233);
		marks.add(273);
		marks.add(23);
		marks.add(298);
		
		Integer[] a = marks.stream().toArray(Integer[] :: new); // Constructor refrence
		
		Stream.of(a).forEach(null);
		
		
		String aa= "Hi i am nilesh";
		Stream<String> s = Stream.of(aa);
		s.forEachOrdered(s1->{
			System.out.println(s1);
		});
		
		for(Integer i : a) {
			System.out.println(i);
		}
		
		
		
		/*
		 * ArrayList<Integer> list = new ArrayList<Integer>(); list.add(43);
		 * list.add(45); list.add(776); list.add(89); int data = 0;
		 * list.stream().map(v->{data++;return v;}).collect(Collectors.toList());
		 * System.out.print(data);
		 */
	}
}
