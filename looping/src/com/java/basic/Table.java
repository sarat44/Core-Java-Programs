package com.java.basic;

public class Table {

	public static void main(String[] args) {
		int number = 2;
		printMultiplicationTable(number);
		int a=1;
		int b=4;
		for(a=1;a<=10;a++) {
			System.out.println(b+"*"+a+"="+(b*a));
		}
	}
	
	private static void printMultiplicationTable(int n) {
		System.out.println("Multiplication table for "+n);
		System.out.println("---------------------------");
		for(int i = 1; i<=10;i++) {
			System.out.format("%2d x %d = %3d\n", i,n,i*n);
		
		}

	}
	

}
