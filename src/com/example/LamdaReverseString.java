package com.example;

public interface LamdaReverseString {
	String reverseString(String str);
	public static void main(String args[])
	{
		LamdaReverseString reverse=(str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result += str.charAt(i);
			return result;
		};
		
		System.out.println(reverse.reverseString("bala subba"));
	}

}
