package com.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string to reverse :");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse= reverse+str.charAt(i);
		}
		System.out.println("reverse string is:" + reverse);

	}

}
