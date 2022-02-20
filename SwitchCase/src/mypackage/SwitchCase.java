package mypackage;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		n=obj.nextInt();
		
		switch(n) {
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		default: System.out.println("Invalid number");
		}

	}

}
