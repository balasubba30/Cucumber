package com.samples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<>(new MyComparator());
		t.add(3);
		t.add(6);
		t.add(2);
		t.add(4);
		System.out.println(t);
	}
	
}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		//return I1.compareTo(I2);
		return I2.compareTo(I1);
	}
	
}

