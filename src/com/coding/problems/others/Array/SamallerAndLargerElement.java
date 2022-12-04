package testing.GeeksExamples.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Given a sorted array Arr of size N and a value X, f
ind the number of array elements less than or equal to X and elements more than or equal to X. 

Example 1:

Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0.
Example 2:

Input:
N = 7, X = 5
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 2 5
Explanation: There are 2 elements less or
equal to 5 and 5 elements greater or equal
to 5.
Your Task:
You don't need to read input or print anything. 
Your task is to complete the function getMoreAndLess() which takes the array of integers arr, n and x as
 parameters and returns an array of size 2. pair denoting the answer. The first value is number of elements less than or equal to x and the second value is number of elements more than or equal to x.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
0 ≤ X ≤ 106
1 ≤ Arr[i] ≤ 106*/

public class SamallerAndLargerElement {

	static int[] getMoreAndLess(int[] a, int n, int x) {
		int minValue = 0;
		int maxValue = 0;
		for(int i=0;i<n;i++) {
			if(a[i] >= x) {
				maxValue++;
			}
			
			if(a[i] <= x) {
				minValue ++;
			}
		}
		int[] returnArray = new int[2];
		returnArray[0] = minValue;
		returnArray[1] = maxValue;
		return returnArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7, X = 5;
		int[] arr = {1, 2, 8, 10, 11, 12, 19};
		int[] moreAndLess = getMoreAndLess(arr,N,X);
		
		Arrays.stream(moreAndLess).forEach(System.out::println);

	}

}
