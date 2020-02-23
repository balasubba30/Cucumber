package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(4);
		al.add(2);
		al.add(8);
		al.add(5);
		al.add(3);
		
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					System.out.println(al.get(i));
					
				
				}
			}
		}
		
		
 			
		
	}

	

}
