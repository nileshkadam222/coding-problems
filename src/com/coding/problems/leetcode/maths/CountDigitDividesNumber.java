package com.coding.problems.leetcode.maths;

public class CountDigitDividesNumber {

    private static int countDigitsDividesNum(int num){

        int orignalNumber = num;
        int count = 0;
        while(num != 0){
            int lastDigit = num % 10;
            if(orignalNumber % lastDigit == 0){
                count ++;
            }
            num = num/10;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("1248 -> " + countDigitsDividesNum(1248 ));
    }
}
