package testing.GeeksExamples.ArrayList;

import java.util.ArrayList;

class Student{
	private String name;
	private int age;
	private ArrayList<String> hobbies = null;
	
	public Student(String n,int a,ArrayList<String> h) {
		this.name = n;
		this.age = a;
		this.hobbies = h;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
}
public class ListWithConstructor {

	public static void main(String[] args) {
		ArrayList<String> h = new ArrayList<String>();
		h.add("h1");
		h.add("h2");
		h.add("h3");
		Student s = new Student("Nilesh", 21, h);
		System.out.println("Name :"+ s.getName());
		System.out.println("Age :"+ s.getAge());
		System.out.println("Hobbies :"+ s.getHobbies());
	}

}
