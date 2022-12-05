package com.coding.problems.leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        String[] s1 = s.trim().split(" ");
        String s2 = s1[s1.length];
        return s2.length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

}
