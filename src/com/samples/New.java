package com.samples;

import java.util.Scanner;
import java.util.StringTokenizer;

public class New {

	public static void main(String[] args) {
		int count=0;
		String str="subbu";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					
				}
			}
		}
	}
	
	
	
}
