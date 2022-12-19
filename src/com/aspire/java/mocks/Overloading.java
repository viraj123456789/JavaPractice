package com.aspire.java.mocks;

public class Overloading 
{
	int a;
	
	public void addition()
	{
		int a=10;
		
		System.out.println("i am addition "+a+" "+this.a);
	}
	
	public void additon(int a)
	{
		System.out.println(a);
	}
	
	public void addition(int a, int b)
	{
		System.out.println("addtion"+(a+b));
	}
	public static void main(String[] args) 
	{
		Overloading o = new Overloading();
		o.addition();
	}

}
