package com.coding.problems.twopointer;

import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

public class SquarOfSortedArray {

    public static  int[] sortedSquares(int[] nums) {
        // separate positive and neg numbs
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        // add all positive in result if no neg
        if(neg.isEmpty()){
            return pos.stream().map(m-> m * m).mapToInt(Integer::intValue).toArray();
        }
        //add all neg in result if no pos
        if(pos.isEmpty()){
            List<Integer> collect = neg.stream().map(m -> m * m).collect(Collectors.toList());
            Collections.reverse(collect);
            return collect.stream().mapToInt(Integer::intValue).toArray();
        }
        // megre 2 sorted array
        for(int i=0; i< pos.size(); i++){
            pos.set(i, pos.get(i) * pos.get(i));
        }

        for(int i=0; i < neg.size(); i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        int np = 0 ,pp = 0;
        int n = neg.size();
        int p = pos.size();
        int[] res = new int[n+p];
        int rp = 0;
        while(np < n && pp < p){
            if(neg.get(np) <= pos.get(pp)){
                res[rp] = neg.get(np);
                rp++;
                np++;
            }else{
                res[rp] = pos.get(pp);
                rp++;
                pp++;
            }
        }

        while(np < n){
            res[rp] = neg.get(np);
            rp++;
            np++;
        }

        while (pp < p){
            res[rp] = pos.get(pp);
            rp++;
            pp++;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

        int[] nums1 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums1)));
    }
}
