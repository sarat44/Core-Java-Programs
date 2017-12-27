package com.java.basic;

public class sampl1 {

	public static void main(String[] args) {
		one o = new one();
		o.method();
	}

}
class one{
	String st="sukesh";
	public void method() {
		System.out.println("NAME: "+st);
		System.out.println("Name length: "+st.length());
	}
}
