package testing.GeeksExamples.Array;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".

Example 1:

Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.

Example 2:

Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT

User Task:
The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and return the boolean value true if it Perfect else false. The drivercode automatically adds a new line.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 105
1 ≤ ai ≤ 103*/



public class PerfectArray {
	
	
	static BiPredicate<int[],Integer> isPerfectArray = (a,n)->{
		for(int i =0;i<n;i++) {
			if(a[i] != a[n-i-1]) {
				return false;
			}
		}
		return true;
	};

	public static boolean IsPerfect(int a[],int n) {
		for(int i =0;i<n;i++) {
			if(a[i] != a[n-i-1]) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 9, 1};
		
		boolean isPerfect = IsPerfect(arr,5);
		if(isPerfectArray.test(arr, 5)) {
			System.out.print("PERFECT");
		}else {
			System.out.print("NOT PERFECT");
		}
		
		
	}
	
	

}
