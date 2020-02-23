package com.example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet( new MyCopmarator());
		t.add(20);	
		t.add(0);	
		t.add(15);	
		t.add(5);	
		t.add(10);	
		System.out.println(t);
		

	}

}

class MyCopmarator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1= (Integer)o1;
		Integer I2=(Integer)o2;
		
		return -1;
	}
	
}
