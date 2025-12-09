package com.coding.problems.others.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student>{
    private final String firstName;
    private final String lastName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(student o) {
        int byFirstName = this.firstName.compareTo(o.firstName);
        if (byFirstName == 0){
           return this.lastName.compareTo(o.lastName);
        }
        return byFirstName;
    }
}

public class SortListByNameAndAgeUsingComparable {

    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student("Nilesh", "Patil"));
        students.add(new student("Amit", "Sharma"));
        students.add(new student("Ravi", "Kumar"));
        students.add(new student("Amit", "Aharma"));
        students.add(new student("Amit", "Verma"));
        students.add(new student("Sneha", "Joshi"));


        Collections.sort(students);

        students.forEach(System.out::println);

    }
}
