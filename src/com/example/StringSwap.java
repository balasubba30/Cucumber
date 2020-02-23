package com.example;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Love";
		String b="You";
		System.out.println("Before swapping :" + a + " " + b);
		a=a+b;
		b= a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swap :" + a + " " + b);
		
	}

}
