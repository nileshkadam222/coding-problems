package com.coding.problems.others.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {
    public static void main(String[] args) {

        //  Print even numbers
        List<Integer> evenNumber = IntStream.range(0, 20).boxed().filter(num -> num %2==0).collect(Collectors.toList());
        List<Integer> oddNumber = IntStream.range(0, 20).boxed().filter(f -> f % 2 != 0).collect(Collectors.toList());
        System.out.println("Even  Number : "+ evenNumber);
        System.out.println("Odd  Number : "+ oddNumber);


        Map<Boolean, List<Integer>> partition = IntStream.range(0, 20).boxed().collect(Collectors.partitioningBy(p -> p % 2 == 0));
        System.out.println("Even  Number [partition] : "+ partition.get(true));
        System.out.println("Odd  Number [partition] : "+ partition.get(false));

    }
}
