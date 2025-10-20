package com.coding.problems.leetcode.maths;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int orignalNumber = x;
        int rev = 0;

        while(x > 0){
            int lastDigit = x % 10;
            rev = rev  * 10 + lastDigit;
            x  = x /10;
        }

        return orignalNumber == rev;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

        System.out.println(isPalindrome(1211232));
    }


}
