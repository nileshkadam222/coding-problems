package com.coding.problems.others.Array;

public class findTarget {

    private static int getIndex(int[] a, int target){
        for(int i= 0; i< a.length; i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Only work on sorted array
    private static int getIndexWithBinarySearch(int[] a, int target){
        int left = 0;
        int right = a.length;

        while(left < right){
            int mid = (left + right)/2;
            if(target == a[mid]){
                return mid;
            }else if(target < mid){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        int[] rotatedArray = {6,7,8,1,2,3,4,5};

        System.out.println(getIndex(input, 6));
        System.out.println(getIndexWithBinarySearch(input, 6));
        System.out.println(getIndexWithBinarySearch(rotatedArray, 3));
    }
}
