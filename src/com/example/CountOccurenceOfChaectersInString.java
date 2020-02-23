package com.example;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfChaectersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="balasubba";
		char[] name=str.toCharArray();
		/*for(int i=0;i<name.length;i++)
			System.out.println(name[i]);*/
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		for(char c:name)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c,1);
			}
		}
		for(Map.Entry<Character, Integer> entry:count.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
		

	}

}
