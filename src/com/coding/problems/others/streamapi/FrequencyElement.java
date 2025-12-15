package com.coding.problems.others.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyElement {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("A");
        students.add("A");
        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("D");

        //Find the frequency of each element in a list
        Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((key, value) -> System.out.println("Key : "+ key+ ", Frequency : "+ value));

    }


}
