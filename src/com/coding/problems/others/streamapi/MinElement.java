package com.coding.problems.others.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class MinElement {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nilesh", 1, 300));
        students.add(new Student("Yogesh", 2, 200));
        students.add(new Student("Harshu", 3, 600));
        students.add(new Student("Anish",4, 100));

        // Find the max value in a list
        Optional<Student> minMarks =  students.stream().min(((o1, o2) -> o1.getMarks().compareTo(o2.getMarks())));
        System.out.println("Min Name : " + minMarks.get().getName() + " Marks: "+ minMarks.get().getMarks());

        Optional<Student> min = students.stream().min(Comparator.comparing(Student::getMarks));
        System.out.println("Min Name : " + min.get().getName() + " Marks: "+ min.get().getMarks());

        Optional<Student> collect = students.stream().collect(Collectors.minBy(Comparator.comparing(Student::getMarks)));
        System.out.println("Min Name : " + collect.get().getName() + " Marks: "+ collect.get().getMarks());

    }


}
