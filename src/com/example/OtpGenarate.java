package com.example;

import java.util.Random;
import java.util.regex.Pattern;

public class OtpGenarate {
	public char[] OTP(int len)
	{
		System.out.println("program for genatrating Random OTP");
		String numbers="0123456789";
		Random r=new Random();
		char[] otp=new char[len];
		for(int i=0;i<len;i++)
		{
			otp[i]=numbers.charAt(r.nextInt(numbers.length()));
			
		}
		return otp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=6;
		OtpGenarate o=new OtpGenarate();
		System.out.println(o.OTP(length));

	}

}
