package com.coding.problems.others.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private final String firstName;
    private final String lastName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {
        int byFirstName = this.firstName.compareTo(o.firstName);
        if (byFirstName == 0){
           return this.lastName.compareTo(o.lastName);
        }
        return byFirstName;
    }
}

public class SortListByNameAndAgeUsingComparable {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nilesh", "Patil"));
        students.add(new Student("Amit", "Sharma"));
        students.add(new Student("Ravi", "Kumar"));
        students.add(new Student("Amit", "Aharma"));
        students.add(new Student("Amit", "Verma"));
        students.add(new Student("Sneha", "Joshi"));


        Collections.sort(students);

        students.forEach(System.out::println);

    }
}
