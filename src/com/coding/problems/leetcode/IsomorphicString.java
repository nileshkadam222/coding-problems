package com.coding.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    private static boolean isIsomorphic(String str1,String str2){
        Map<Character,Character> mappingMap = new HashMap<>();

        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char str1Char = str1.charAt(i);
            char str2Char = str2.charAt(i);
            if(mappingMap.containsKey(str1Char)){
                if(str2Char != mappingMap.get(str1Char)){
                    return false;
                }
            }else if(!mappingMap.containsValue(str2Char)){
                mappingMap.put(str1Char,str2Char);
            }else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "egg", str2 = "add";
        //String str1= "badc",str2= "baba";

        System.out.println(isIsomorphic(str1,str2));
    }
}
