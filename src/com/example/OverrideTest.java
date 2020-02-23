package com.example;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 class Parent {

	public  void m1() throws Exception {
	System.out.println("parent m1");	
		
	}
	
}

class Child extends Parent {
	

	public  void m1()  throws IOException,Exception
	{
		//super.m1();
		System.out.println("child m1");
		
	}
	
}
public class OverrideTest
{
	public static void main(String args[])  
	{
	   
	   // Parent p=new Child();
		//Child c=new Child();
	    //c.m1();
	    
		
	}
	
}