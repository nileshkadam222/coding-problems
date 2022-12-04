package testing.GeeksExamples.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*ArrayList are dynamic size arrays. Try this problem using ArrayList.

Given a ArrayList of n elements and a integer q defining the query number(which will be either 1 or 2) :
Query 1 includes two integers p and r. Which means add a value r at and index p in the ArrayList and print the whole updated ArrayList.
Query 2 includes one integer p. In this query print the index at which the value p is last found in the ArrayList. If the value p is not found int he ArrayList then print "-1". 

NOTE: Assume 0 based indexing

Input:
First line of input file contains an integer T, denoting the number of test cases. Then T test case follow. 
First line of each test case contains two integer n and q(space separated). 
Second Line of each test case consists of n spaced integers. 
Third line consists of 2 integers if the value of q is 1 otherwise consists of a single integer.

Output:
For each test case, print required  output.

Constraints:
1<=T<=10
1<=n<=104
1<=element<=103

Example:
Input:
2
5 1
1 4 5 9 3
2 6
4 2
1 9 2 4
4


Output:
1 4 6 5 9 3 
3*/
public class ArrayListSet1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T != 0) {
			int arr[] = new int[2];
			for(int i=0;i<2;i++) {
				arr[i] = sc.nextInt();
			}
			int n = arr[0];
			int q = arr[1];
			
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				l.add(sc.nextInt());
			}
			
			if(q== 1) {
				int arr1[] = new int[2];
				for(int i=0;i<q;i++) {
					arr1[i] = sc.nextInt();
				}
				int p = arr[0];
				int r = arr[1];
				l.add(p, r);
				System.out.println(l);
			}else {
				int p = sc.nextInt();
				int lastIndexOf = l.lastIndexOf(p);
				System.out.println(lastIndexOf);
			}
			T--;
		}
		
		// TODO Auto-generated method stub

	}

}
