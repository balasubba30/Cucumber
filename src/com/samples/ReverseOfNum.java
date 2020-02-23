package com.samples;

import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		int reverse=0;
		System.out.println("enter a number to reverse");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		while(num > 0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("reverse of number is :" + reverse);

	}

}
