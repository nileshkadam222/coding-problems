package com.coding.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> containsSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (containsSet.contains(nums[i])){
                return true;
            }
            containsSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputs = {1,2,3,4};
        System.out.println(containsDuplicate(inputs));
    }
}
