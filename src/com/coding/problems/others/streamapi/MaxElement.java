package com.coding.problems.others.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class MaxElement {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nilesh", 1, 300));
        students.add(new Student("Yogesh", 2, 200));
        students.add(new Student("Harshu", 3, 600));
        students.add(new Student("Anish",4, 100));

        // Find the max value in a list
        Optional<Student> topStudent = students.stream()
                .max((s1, s2) -> s1.getMarks().compareTo(s2.getMarks()));

        System.out.println("Top student way 1: "+ topStudent);

        Optional<Student> topStudent2Way = students.stream()
                .max(Comparator.comparing(Student::getMarks));

        System.out.println("Top Student way 2: "+ topStudent2Way);

        int topStudent3Way = students.stream().mapToInt(Student::getMarks).max().getAsInt();
        System.out.println("Top Student way 3: "+ topStudent3Way);

        int topStudent4Way = students.stream().
                collect(Collectors.maxBy((o1, o2)-> o1.getMarks().compareTo(o2.getMarks()))).map(Student::getMarks).get();

        System.out.println("Top Student way 3: "+ topStudent4Way);
    }


}
