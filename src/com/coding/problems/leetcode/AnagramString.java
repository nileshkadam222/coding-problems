package com.coding.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }
}
