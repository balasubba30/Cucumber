package com.example;

public class CountOfObjects {
	public static int count;
	public CountOfObjects() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfObjects c1=new CountOfObjects();
		CountOfObjects c2=new CountOfObjects();
		System.out.println(CountOfObjects.count);

	}

}
