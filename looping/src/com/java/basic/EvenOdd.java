package com.java.basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 int num;
		    System.out.println("Enter an Integer number:");
		    @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
		    num = s.nextInt();
		    if ( num % 2 == 0 )
		        System.out.println("Entered number is even");
		     else
		        System.out.println("Entered number is odd");
	}

}
