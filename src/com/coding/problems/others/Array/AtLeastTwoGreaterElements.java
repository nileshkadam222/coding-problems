package testing.GeeksExamples.Array;

import java.util.stream.Stream;

/*Given an array of N distinct elements, 
 * the task is to find all elements in array except two greatest elements.

Example 1:

Input : 
a[] = {2, 8, 7, 1, 5};
Output :
2  1  5  
Explanation :
The output three elements have two or
more greater elements
      
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1};
Output :
-2 3 4 -1 
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector  sorted values denoting the elements in array which have at-least two greater elements than themselves.

Expected Time Complexity: O(N. Log(N))
Expected Auxiliary Space: O(N)

Constraints:
3 ≤ N ≤ 105
-106 ≤ A[] ≤ 106*/

public class AtLeastTwoGreaterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = { 2, 8, 7, 1, 5 };
		long max1 = arr[0];
		long max2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max1 < arr[i]) {
				max1 = arr[i];
			}else if (max2 < max1 && max2 < arr[i]) {
				max2 = arr[i];
			}
		}

		long[] newArray = new long[arr.length-2];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max1 != arr[i] && max2 != arr[i]) {
				newArray[j] = arr[i];
				j++;
			}

		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);

		}
	}

}
