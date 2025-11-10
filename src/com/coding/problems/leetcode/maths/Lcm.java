package com.coding.problems.leetcode.maths;/* LCM
	input => Number1 and Number2
	operation  -> LCM = (number1 * number2)/GCD(number1,number2)
	output -> LCM of Number1 and Number2
*/

class Lcm{

	private static int gcd(int number1, int number2){
		while(number1 != number2){
			if(number1 > number2){
				number1 = number1 - number2;
			}else{
				number2 = number2 - number1;
			}
		}
		return number1;
	}

	private static int lcm(int number1, int number2){
		return (number1 * number2)/gcd(number1, number2);
	}	

	public static void main(String[] args) {	
		System.out.println("LCM : 10 and 15 -> " + lcm(10, 15));
	}
}