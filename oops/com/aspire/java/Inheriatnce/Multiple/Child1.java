package com.aspire.java.Inheriatnce.Multiple;

public class Child1 implements Parent1, Parent2
{ 
	@Override
	public void method2() 
	{
		System.out.println("Parent 2");	
	}
	@Override
	public void method2(String b) 
	{
		System.out.println("this is "+b);
	}
	@Override
	public void method2(int b, int c) 
	{
		System.out.println("the substraction is = "+ (b+c));
	}

	@Override
	public void method1() 
	{
		System.out.println("Parent 1");
	}
	@Override
	public void method1(String a) 
	{
	System.out.println("this is "+a);	
	}
	@Override
	public void method1(int b,int c) 
	{
	System.out.println("the addition is ="+ (c-b));	
	}

}
