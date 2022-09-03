package com.coding.problems.leetcode;

import java.util.Stack;

public class BalancedBrackets {


    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (isBalancedBrackets(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }

    public static boolean isBalancedBrackets(String expr){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<expr.length();i++){

            char currentElement = expr.charAt(i);
            if(currentElement == '(' || currentElement == '{' || currentElement == '['){
                stack.push(currentElement);
            }

            if (stack.isEmpty()){
                return false;
            }

            char check;

            switch (currentElement){
                case ')':{
                    check = stack.pop();
                    if (check == '{' || check == '['){
                        return false;
                    }
                    break;
                }
                case '}':{
                    check = stack.pop();
                    if (check=='(' || check == '['){
                        return false;
                    }
                    break;
                }
                case ']':{
                    check = stack.pop();
                    if(check=='(' || check == '{'){
                        return false;
                    }
                    break;
                }
            }

        }
        return stack.isEmpty();
    }
}
