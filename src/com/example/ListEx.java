package com.example;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("monday");
		al.add("tuesday");
		al.add("wednsday");
		ArrayList<String> result=new ArrayList<>();
		for ( String s:al)
		{
			if(s.contains("e"))
			{
				result.add(s);
				System.out.println(s);
			}
		}

	}

}
