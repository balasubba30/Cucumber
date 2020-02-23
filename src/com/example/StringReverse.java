package com.example;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		String str="balasubbarayudu";
		char[] arry=str.toCharArray();
		for(int i=0;i<arry.length/2;i++)
		{
			 temp=arry[i];
			arry[i]=arry[arry.length-i-1];
			arry[arry.length-i-1]=(char) temp;
		}
		
		System.out.println(Arrays.toString(arry));
		 String rev =new String(arry);
		 System.out.println(rev);
	      
	}

}
