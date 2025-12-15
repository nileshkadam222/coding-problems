package com.coding.problems.others.streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

    public static void main(String[] args) {
       String input = "hello world";

        //Find the frequency of each character in a string

        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }


}
