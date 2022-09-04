package com.coding.problems.leetcode;

import java.util.Arrays;

public class MergerdSortedArray {


    public static int[] mergedSortedArray(int[] a,int[] b){

        int array1Size = a.length;
        int array2Size = b.length;

        int[] mergedArray = new int[array1Size+array2Size];
        int aPosition = 0,bPosition = 0,mergedPosition = 0;

        while(aPosition < array1Size && bPosition < array2Size){
            if(a[aPosition] < b[bPosition]){
                mergedArray[mergedPosition++] = a[aPosition++];
            }else {
                mergedArray[mergedPosition++] = b[bPosition++];
            }
        }

        while (aPosition < array1Size){
            mergedArray[mergedPosition++] = a[aPosition++];
        }
        while (bPosition < array2Size){
            mergedArray[mergedPosition++] = b[bPosition++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] foo = { 3, 7 };
        int[] bar = { 4, 8, 11 };
        int[] array = mergedSortedArray(foo,bar);

        Arrays.stream(array).forEach(System.out::println);
    }
}
