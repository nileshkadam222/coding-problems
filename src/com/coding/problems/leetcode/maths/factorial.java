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


    // 120 -> 1
    // 123	-> 0
    private static int trallingZero(int number){
        int count = 0;
        while(number != 0){
            int lastDigit = number % 10;
            if(lastDigit != 0){
                break;
            }
            count ++;
            number = number /10;
        }
        return  count;
    }

	public static void main(String[] args){
        int factOfFive = getFactorial(5);
        int factOfThree = getFactorial(3);
        System.out.println("5 -> " + factOfFive +  " Zero -> " + trallingZero(factOfFive));
        System.out.println("3 -> " + factOfThree +  " Zero -> " + trallingZero(factOfThree));
	}
}