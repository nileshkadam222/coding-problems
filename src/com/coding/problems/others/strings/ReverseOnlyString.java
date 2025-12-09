package com.coding.problems.others.strings;

import java.util.Arrays;

public class ReverseOnlyString {

    private static String reverseString(String input){

        char[] inputArray = input.toCharArray();
        int pointer1 = 0;
        int pointer2 = inputArray.length  - 1;

        while(pointer1 < pointer2){
            while(pointer1 < pointer2 && !Character.isLetter(inputArray[pointer1])){
                pointer1 ++;
            }
            while (pointer1 < pointer2 && !Character.isLetter(inputArray[pointer2])){
                pointer2 --;
            }

            if(pointer1 < pointer2){
                char pointer1Char = inputArray[pointer1];
                inputArray[pointer1] = inputArray[pointer2];
                inputArray[pointer2] = pointer1Char;
                pointer2--;
                pointer1 ++;
            }
        }
        return Arrays.toString(inputArray);
    }

    public static void main(String[] args) {
        String input = "Ni123le##sh";
        System.out.println(input + " " + reverseString(input));
    }
}
