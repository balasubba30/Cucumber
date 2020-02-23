package com.samples;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("child thread");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		System.out.println(t.currentThread().getName());
		//System.out.println("Main Thread");
		System.out.println(t.currentThread().getPriority());
		t.setPriority(10);
		System.out.println(t.getPriority());
		
		

	}

}
