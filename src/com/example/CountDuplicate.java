package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("stack");
		list.add("overflow");
		list.add("stack");
		list.add("yahoo");
		list.add("msn");
		list.add("MSN");
		list.add("stack");
		list.add("overflow");
		list.add("user");
		System.out.println(list);
		
		Map<String,Integer> counts=new HashMap<String,Integer>();
		for(String str:list)
		{
			if(counts.containsKey(str))
			{
				counts.put(str, counts.get(str)+1);
				
			}
			else
			{
				counts.put(str, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:counts.entrySet())
		{
			System.out.println(entry.getKey()+ "=" + entry.getValue());
		}
		
	}

}
