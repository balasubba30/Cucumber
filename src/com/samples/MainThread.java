package com.samples;

public class MainThread {

	private static final int MAX_PRIORITY = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t=new Thread();
		System.out.println(t.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("Running Main Thread");
		}
		System.out.println(t.currentThread().getPriority());
		t.setPriority(MAX_PRIORITY);
		System.out.println(t.currentThread().getPriority());
		//Thread.currentThread().join();
	}

}
