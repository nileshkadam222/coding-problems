package testing.GeeksExamples.JavaTest;

import java.util.Scanner;

public class GenericClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			Integer c = sc.nextInt();
			if(c == 1) {
				String a = sc.next();
				String type = a.getClass().getTypeName();
				String[] split = type.split(".");
				//System.out.println(Type);
				System.out.println(a);
			}else if(c == 2) {
				Integer b= sc.nextInt();
				String Type = b.getClass().getTypeName().split(".")[2];
				System.out.println(Type);
				System.out.println(b);
			}
		}
	}

}
