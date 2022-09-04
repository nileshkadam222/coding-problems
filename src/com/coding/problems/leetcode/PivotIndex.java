package com.coding.problems.leetcode;

import java.util.Arrays;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {

        int leftSum=0;
        int sum = Arrays.stream(nums).sum();

        for(int i=0;i<nums.length;i++){
            if(leftSum == (sum - leftSum - nums[i])){
                return i;
            }
            leftSum+= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] a = {1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }
}
