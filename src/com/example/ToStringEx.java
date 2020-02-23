package com.example;

public class ToStringEx {
	String name;
	int rollnum;
	ToStringEx(String name,int rollnum)
	{
		this.name=name;
		this.rollnum=rollnum;
	}

	public String toString()
	{
		return name + " " + rollnum;
	}
	/*public int hashCode()
	{
		return 100;
	}*/
	public boolean equals(Object obj)
	{
		try {
		String name1=this.name;
		int rollnum1=this.rollnum;
		ToStringEx exm=(ToStringEx)obj;
		String name2=exm.name;
		int rollnum2=exm.rollnum;
		if(name1.equals(name2) && rollnum1==rollnum2)
			return true;
		else
		return false;
		}
		catch(ClassCastException ex)
		{
			return false;
		}
		catch(NullPointerException ex)
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringEx ex=new ToStringEx("bala", 3);
		ToStringEx ex1=new ToStringEx("bala", 3);
		ToStringEx ex2=ex;
		System.out.println(ex.equals(ex1));
		System.out.println(ex.equals(ex2));
		System.out.println(ex);
		System.out.println(ex.hashCode());
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		System.out.println(System.identityHashCode(ex));
		
		
		

	}

}
