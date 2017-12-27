package com.java.basic;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		int x=2;
		int y=2;
		if(x<y) {
			System.out.println("y is greater");
		}
		else if(x>y){
			System.out.println("x is greater");
		}
		else if(x==y){
			System.out.println("x and y are equal");
		}
		for(int k=0; k<10; k++) {
			System.out.println("k= " +k);
		}
		for(int l=10; l>0 ; l--) {
			System.out.println("l= " +l);
		}
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.println(i);
			}
			System.out.println();
		}
		int c=0;
		System.out.println("Printing numbers from 1 to 20");
		while(c<20) {
			c=c+1;
			System.out.println(c);
		}
		int d=0;
		System.out.println("Printing numbers from 1 to 10");
		do {
			d=d+1;
			System.out.println(d);
		}while(d<10);
		Scanner m = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=m.nextInt();
	    for(int i=1; i <= 10; i++){
	    	System.out.println(n+" * "+i+" = "+n*i);
	     }
	}

}
