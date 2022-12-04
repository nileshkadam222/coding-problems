package testing.DurgaSir.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	public String name;
	public int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + "--" + id;
	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.id;
		Employee e = (Employee) o;
		int eid2 = e.id;
		return (eid1 < eid2) ? -1 : (eid1 > eid2) ? 1 : 0;
	}

}

public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t = new TreeSet();
		Employee e = new Employee("Nilesh", 2);
		Employee e1 = new Employee("Harshu", 1);
		Employee e2 = new Employee("Yogesh", 4);
		Employee e3 = new Employee("Ashok", 5);
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println("ASC Sorting"+ t);
		
	}

}
