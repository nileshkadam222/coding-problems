package com.coding.problems.others.JavaTest;


@FunctionalInterface
interface Operation{
    int operate(int a, int b);

}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Operation add = Integer::sum;
        System.out.println(add.operate(10, 20));
    }
}
