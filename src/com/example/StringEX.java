package com.example;

public class StringEX {

	
	public void m1(String s)
	{
		System.out.println("calling Strings");
	}
	public void m1(Object o)
	{
		System.out.println("calling object");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=null;
		StringEX ex=new StringEX();
		ex.m1(s1);
		
	}

}
