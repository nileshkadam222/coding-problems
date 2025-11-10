package com.coding.problems.leetcode.maths;

import java.math.BigInteger;

//Find the factorial of number.
//5 => 5*4*3*2*1
class factorial{

	private static long getFactorial(long number){
        if(number < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

		long factorial = 1;
		for(int i=1; i<= number; i++){
			factorial = factorial * i;
		}
		return factorial;
	}


    // 120 -> 1
    // 123	-> 0
    private static int trallingZero(long number){
        int count = 0;
        while(number != 0){
            long lastDigit = number % 10;
            if(lastDigit != 0){
                break;
            }
            count ++;
            number = number /10;
        }
        return  count;
    }

	public static void main(String[] args){
        long factOfFive = getFactorial(5);
        long factOfThree = getFactorial(3);
        long factOf13= getFactorial(13);
        long factO30= getFactorial(30);
        System.out.println("5 -> " + factOfFive +  " Zero -> " + trallingZero(factOfFive));
        System.out.println("3 -> " + factOfThree +  " Zero -> " + trallingZero(factOfThree));
        System.out.println("13 -> " + factOf13 +  " Zero -> " + trallingZero(factOf13));
        System.out.println("30 -> " + factO30 +  " Zero -> " + trallingZero(factO30));
	}
}