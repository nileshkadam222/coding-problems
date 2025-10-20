package com.coding.problems.leetcode;

public class CountDigits {

    private static int countDigits(int num){
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            num = num /10;
            count ++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countDigits(1234));
        System.out.println(countDigits(0));
    }
}
