package com.aspire.java.polymorphism.overloading;

public class Parent
{
	public void viraj()
	{
		System.out.println(" ");
	}
	
	public void viraj(byte a)
	{
		System.out.println("Viraj - datatype byte "+a);
	}
	
	public void viraj(short b)
	{
		System.out.println("Viraj - datatype short "+b);
	}
	
	public void viraj(int c)
	{
		System.out.println("Viraj - datatype int "+c);
	}
	
	public void viraj(long a)
	{
		System.out.println("Viraj - datatype long "+a);
	}
	
	public void viraj(float a)
	{
		System.out.println("Viraj - datatype float "+a);
	}
	
	public void viraj(double a)
	{
		System.out.println("Viraj - datatype double "+a);
	}
	
	public void viraj(char a)
	{
		System.out.println("Viraj - datatype char "+a);
	}
	
	public void viraj(boolean a)
	{
		System.out.println("Viraj - datatype boolean "+a);
	}
	
	public void viraj(int a, int b)
	{
		System.out.println("Viraj - addition  "+(a+b));
	}
	
}
