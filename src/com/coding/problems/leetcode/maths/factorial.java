package com.coding.problems.leetcode.maths;

//Find the factorial of number.
//5 => 5*4*3*2*1
class factorial{

	private static int getFactorial(int number){
		if(number < 1){
			return 1;
		}

		int factorial = 1;
		for(int i=1; i<= number; i++){
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args){
		System.out.println("5 -> " + getFactorial(5));
		System.out.println("3 -> " + getFactorial(3));
	}
}