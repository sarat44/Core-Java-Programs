package com.java.basic;

import org.apache.log4j.Logger;

public class ArraysDemo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ArraysDemo.class);
		logger.info("Array Starting..");
		int a[]= {12,13,44,55,66};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		logger.info("Before printing the values");
		for(int s:a) {
			System.out.println(s);
		}
		int a[]= {10,11,12,13,14};
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
