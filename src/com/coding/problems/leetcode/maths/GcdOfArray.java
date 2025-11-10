package com.coding.problems.leetcode.maths;

// Find Greatest Common Divisor of Array
/*Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.*/

import javafx.util.Pair;

import java.util.Arrays;

public class GcdOfArray {

    private static  int gcd(int number1, int number2){
        while (number1 != number2){
            if(number1 > number2){
                number1 = number1 - number2;
        }else {
                number2 =  number2 - number1;
            }
        }
        return number1;
    }

    public static void main(String[] args) {
        int nums[] = {2,5,6,9,10};
        int min= Arrays.stream(nums).min().getAsInt();

        int max = Arrays.stream(nums).max().getAsInt();


        System.out.println("min : "+ min + " Max : "+ max);
        System.out.println("The greatest common divisor of 2 and 10 " + gcd(min, max));
    }
}
