package com.aspire.java.abstraction;

public class Concrete extends Abstract
{

	@Override
	public void Div() 
	{
		System.out.println("division is =" +(a/b));
		
	}

	@Override
	public void sub() 
	{
		System.out.println("substraction is ="+ (a-b));
	}
	
	public static void main(String[] args) 
	{
		Concrete c = new Concrete();
		c.method1();
		c.addition();
		c.Div();
		c.sub();
	}

}
