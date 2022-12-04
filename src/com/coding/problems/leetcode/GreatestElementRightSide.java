package com.coding.problems.leetcode;

import java.util.Arrays;

public class GreatestElementRightSide {

    public static  int[] replaceElements(int[] arr) {

        int endIndex = arr.length;
        for(int i=0;i<endIndex;i++){
            if(i==arr.length-1){
                arr[i] = -1;
                return arr;
            }
            int startIndex = i+1;
            int max = arr[startIndex];
            for (int j=startIndex+1;j<endIndex;j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
       int[] output = replaceElements(arr);
        Arrays.stream(output).forEach(f->System.out.println(f));
    }
}
