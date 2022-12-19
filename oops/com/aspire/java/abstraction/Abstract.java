package com.aspire.java.abstraction;

abstract public class Abstract 
{
	int a=40;
	int b=20;
	
	public void method1()
	{
		System.out.println("this is complete method");
	}
	
	public void addition()
	{
		System.out.println("addition is ="+ (a+b));
	}
	
	abstract public void Div();
	abstract public void sub();
	
}
