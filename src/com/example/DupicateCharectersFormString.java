package com.example;

import java.util.ArrayList;

public class DupicateCharectersFormString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="massbaaa";
		int count=0;
		char[] inp=str.toCharArray();
		System.out.println("Duplicate charecters are :");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[i]);
					count ++;
					break ;
				}
				
			}
		}
		/*int count=0;
		ArrayList al=new ArrayList<>();
		al.add("bala");
		al.add("siva");
		al.add("bala");
		al.add("xyz");
		al.add("abc");
		al.add("xyz");
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					System.out.println(al.get(j));
					count ++;
					break;
				}
			}
		}*/

	}

}
