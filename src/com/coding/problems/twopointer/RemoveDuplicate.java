package com.coding.problems.twopointer;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        int notOfUniqueElement = 1;
        int officer = 0;
        int cm = 1;
        int len = nums.length;

        while(cm < len){
            if(nums[cm] == nums[cm-1]){
                cm ++;
                continue;
            }
            nums[officer+1] = nums[cm];
            officer++;
            cm++;
            notOfUniqueElement++;
        }

        return notOfUniqueElement;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
