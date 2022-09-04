package com.coding.problems.leetcode;

public class SubsequenceString {

    public static boolean isSubsequence(String s, String t) {
        String sub ="";
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j<s.length() && t.charAt(i) == s.charAt(j)){
                sub = sub + t.charAt(i);
                j++;
            }
        }
        return s.equals(sub);
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
}
