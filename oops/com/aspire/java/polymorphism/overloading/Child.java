package com.aspire.java.polymorphism.overloading;

public class Child extends Parent
{
	public void viraj()
	{
		System.out.println(" viraj ");
	} 
	
	public void viraj(int m,char n )
	{
		System.out.println("Viraj");
	}
	
	public void viraj(boolean a, int a1)       // same variable name is not aloud in parameters with diff datatypes
	{
		System.out.println("Viraj");
	}
	
	public void viraj(int x, int y,int z)
	{
		int x1 = x+y-z; 
		System.out.println("Viraj x y z"+ x1);
	}
	public void viraj(char o, boolean p)
	{
		System.out.println("Viraj");	
	}
	
	public void viraj(short a, int b)
	{
		System.out.println(" viraj ");
	}

}
