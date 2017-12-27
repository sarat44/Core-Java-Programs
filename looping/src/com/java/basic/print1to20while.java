package com.java.basic;

public class print1to20while {
	public static void main(String[] args) {
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
		}while(d<20);
	}

}
