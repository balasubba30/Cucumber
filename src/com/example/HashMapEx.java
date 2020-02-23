package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<>();
		map.put(2, "java");
		map.put(3, "sql");
		map.put(4, "java");
		System.out.println(map);
		map.put(2, "oracle");
		System.out.println(map);
		//System.out.println(map.values());
		HashMap<Integer,String> rmap=new HashMap<>();
		
		
		
	}

}
