package testing.GeeksExamples.DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketCouner {

	public static Queue<Integer> removeLast(Queue<Integer> q) {
		Queue<Integer> tempQ = new LinkedList<Integer>();
		while (!q.isEmpty()) {
			Integer remove = q.remove();
			if (!q.isEmpty()) {
				tempQ.add(remove);
			}

		}
		return tempQ;
	}

	public static Integer removeLastEle(Queue<Integer> q) {
		Queue<Integer> tempQ = new LinkedList<Integer>();
		Integer returnVal = 0;
		while (!q.isEmpty()) {
			Integer remove = q.remove();
			if (!q.isEmpty()) {
				tempQ.add(remove);
			} else {
				returnVal = remove;
			}

		}
		return returnVal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T != 0) {
			int arr[] = new int[2];
			for (int i = 0; i < 2; i++) {
				arr[i] = sc.nextInt();
			}
			int n = arr[0];
			int k = arr[1];

			Queue<Integer> q = new LinkedList<>();
			for (int i = 1; i <= n; i++) {
				q.add(i);
			}
			T--;
			boolean firstFlag = true;
			while (!q.isEmpty()) {
				if(q.size() == k) {
					Integer removeLastEle = removeLastEle(q);
					System.out.println(removeLastEle);
				}else if (q.size() < k) {
					System.out.println(q.peek());
				} else if (firstFlag) {
					for (int i = 0; i < k; i++) {
						q.element();
					}
					firstFlag = false;
				} else {
					for (int i = 0; i < k; i++) {
						Queue<Integer> removeLast = removeLast(q);
						q = removeLast;
					}
					firstFlag = true;
				}
			}
		}
	}
}
