package com.java.basic;

public class deletespaces {
	
	public static void main(String[] args) {
		String s1 = "Bright IT Career";
		String output = s1.replaceAll("\\s", "");
        System.out.println("removing space between words: "+ output);
        
	}

}
