package mypackage;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		n=obj.nextInt();
		if(n==1) {
			System.out.println("One");
		}else if(n==2) {
			System.out.println("Two");
		}else if(n==3) {
			System.out.println("Three");
		}else if(n==4) {
			System.out.println("Four");
		}else {
			System.out.println("Invalid Input");
		}

	}

}
