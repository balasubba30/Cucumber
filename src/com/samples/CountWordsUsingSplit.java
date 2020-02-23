package com.samples;

public class CountWordsUsingSplit {
	public static int countWordsUsingSplit(String input) {
	    if (input == null || input.isEmpty()) {
	      return 0;
	    }

	    String[] words = input.split("\\s+");
	    return words.length;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bala subba";
		System.out.println(countWordsUsingSplit(s));

	}

}
