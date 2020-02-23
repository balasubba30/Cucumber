package com.samples;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		int sum=0;
		System.out.println("enter a number ");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		while(num > 0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum of digits is :" + sum );

	}

}
