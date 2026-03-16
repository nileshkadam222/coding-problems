package com.coding.problems.twopointer;


import java.util.Arrays;

/*
    Two pointer approach
*/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j = nums.length -1;

        while(i<j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

        int[] numbers1 = {2,3,4}; int  target1 = 6;
        System.out.println(Arrays.toString(twoSum(numbers1, target1)));
    }
}
