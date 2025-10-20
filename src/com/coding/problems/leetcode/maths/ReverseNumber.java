package com.coding.problems.leetcode.maths;

public class ReverseNumber {

    static int reverseNumber(int x){
        int num =Math.abs(x);
        int reverse = 0;
        while (num > 0){
            int ld = num % 10;
            reverse = reverse * 10 + ld;
            num =  num/10;
        }
        return (x < 0) ? (-reverse)  : reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(-123));
    }
}
