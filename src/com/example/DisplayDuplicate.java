package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisplayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("stack");
		list.add("overflow");
		list.add("stack");
		list.add("yahoo");
		list.add("msn");
		System.out.println(list);
		HashSet<String> hs=new HashSet<String>();
		for(String str:list)
		{
			if(hs.add(str)== false)
			{
				System.out.println(str);
			}
		}

	}

}
