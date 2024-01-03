package com.coding.problems.gfg;

// User function Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int zeroIndex = -1;
        int oneIndex = -1;
        int twoIndex = -1;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i< S.length(); i++){
            if(S.charAt(i) == '0'){
                zeroIndex = i;
            }

            if(S.charAt(i) == '1'){
                oneIndex = i;
            }

            if(S.charAt(i) == '2'){
                twoIndex = i;
            }

            if(zeroIndex != -1 && oneIndex != -1 && twoIndex != -1){
                ans = Math.min(ans, (i + 1) - Math.min(zeroIndex, Math.min(oneIndex, twoIndex)));
            }
        }
        if(ans == Integer.MAX_VALUE){
            return  -1;
        }
        return ans;
    }
}
public class SmallestWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(reader.readLine());
        while(t-->0){
            String s = reader.readLine();
            Solution solution = new Solution();
            int ans = solution.smallestSubstring(s);
            System.out.println(ans);
        }

    }
}
