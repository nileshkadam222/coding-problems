package com.coding.problems.leetcode.maths;

class Gcd{

	private static int findGcd(int number1, int number2){
		while(number1 != number2){
			if(number1 > number2){
				number1 = number1 - number2;
			}else{
				number2 = number2 - number1;
			}
		}

		return number1;
	}

	public static void main(String[] args) {
        System.out.println(findGcd(2, 10));
        System.out.println(findGcd(3, 8));
        System.out.println(findGcd(3, 3));
	}
}