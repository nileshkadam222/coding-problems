package testing.DurgaSir.ArraysClass;

import java.util.Arrays;
import java.util.List;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] marks = {67,87,54,34,22,98,90};
		System.out.println("Before Sorting");
		for(int i : marks) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After Sorting Array values");
		Arrays.sort(marks);
		Arrays.stream(marks).forEach(i->{
			System.out.print(i + " ");
			
		});
		System.out.println();
		
		//object Type Sorting
		String[] names = {"Nilesh","Harshu","Abhi","Vipul"};
		System.out.println("Before Sorting Array : ");
		Arrays.stream(names).forEach(s->{
			System.out.print(s + "  ");
		});
		System.out.println();
		Arrays.sort(names);
		System.out.println("After Sorting Array : ");
		Arrays.stream(names).forEach(s->{
			System.out.print(s + "  ");
		});
		System.out.println();

		
		//Converting in ArrayList
		List<String> asList = Arrays.asList(names);
		asList.set(2, "Yogesh");
		System.out.println("List Object :");
		asList.stream().forEach(s->{
			System.out.print(s +" ");
		});
		System.out.println();
		Arrays.stream(names).forEach(s->{
			System.out.print(s + "  ");
		});
		System.out.println();
		
		
	}

}
