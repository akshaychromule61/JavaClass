package mypackage;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n;
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter Number");
//	    n=obj.nextInt();
//	    
//	    String result;
	    
//	    if(n%2==0) {
//	    	result = "Even";
//	    }else {
//	    	result = "Odd";
//	    }
	    //result=(n%2==0)?"Even":"Odd";
	    //System.out.println(result);
	     
	    //largest number from out of three numbers
//	    int x = 101;
//	    int y = 99;
//	    int z = 55;
//	    int largestNum;
//	    
//	    largestNum = (x>y)?(x>z)?x:z:(y>z)?y:z;
//	    
//	    System.out.println(largestNum);
//		
	    
	    //print first number divisible by 123 after 1000
	    int p = 1000;
	    while(true) {
	    	if(p%123==0) {
	    		System.out.println(p);
	    		break;
	    	}
	    	p=p+1;
	    }

	}

}
