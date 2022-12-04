package com.coding.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberSystem {

    public static int romanToInt(String s) {
        Map<Character ,Integer> romanNumeralValues = new HashMap<>();
        romanNumeralValues.put('I',1);
        romanNumeralValues.put('V',5);
        romanNumeralValues.put('X',10);
        romanNumeralValues.put('L',50);
        romanNumeralValues.put('C',100);
        romanNumeralValues.put('D',500);
        romanNumeralValues.put('M',1000);

        int sum = 0;
        for(int i=0;i<s.length();i++){
            int firstNumber = romanNumeralValues.get(s.charAt(i));
            int secondNumber = (s.length()-1 == i) ? 0 : romanNumeralValues.get(s.charAt(i+1));
            int total = 0;
            if(firstNumber < secondNumber){
                total = secondNumber - firstNumber;
                i++;
            }else {
                total = firstNumber;
            }
            sum = sum + total;
        }
        return sum;

    }
    public static void main(String[] args) {
       // System.out.println();romanToInt("III");
        System.out.println(romanToInt("MCMXCIV"));
    }
}
