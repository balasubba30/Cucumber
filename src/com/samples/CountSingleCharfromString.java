package com.samples;

public class CountSingleCharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="India";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.toLowerCase().charAt(i)== 'i')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
