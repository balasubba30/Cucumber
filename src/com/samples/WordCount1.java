package com.samples;

import java.util.StringTokenizer;

public class WordCount1 {

	public static int countWordsUsingStringTokenizer(String sentence) {
	    /*if (sentence == null || sentence.isEmpty()) {
	      return 0;
	    }*/
	    StringTokenizer token=new StringTokenizer(sentence);
	   
	    while (token.hasMoreTokens()) {
			
			String s=token.nextToken();
			System.out.println(s);
		}
		return token.countTokens();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="My Name is Bala";
		System.out.println(countWordsUsingStringTokenizer(input));
	}

}
