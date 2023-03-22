package com.aspire.java.Inheriatnce.Single_level;

public class Child_Single_level extends Parent_Single_level
{ 
	static int a = 20;
	 static int b = 10;
	public static  void Bike()
	{
		int a =100;
		System.out.println("this.a(20) + super.a(50) + a(10) = " + (Child_Single_level.a + Parent_Single_level.a + a));
		System.out.println("a + b =" + a + Child_Single_level.a + b);
		System.out.println(Child_Single_level.a + a + b + " = a + b");
		System.out.println("a + b =" + (a+b));
		
		System.out.println("Bike from Child class");
	}
	public void Car()  // over ride
	{
		System.out.println("Car from child class");
	}
	public void Car(int a)  // over load (with inheritance from parent class)
	{
		System.out.println("Car from Parent to child class");
	}
	public void Cash()
	{
		System.out.println("Cash from child class");
	}
	public void Cash(int a)
	{
		System.out.println("Cash from child class");
	}
	public void Cash(int b, int c)
	{
		System.out.println("Cash from child class");
	}
	public void Cash(int c, boolean a, int b)
	{
		System.out.println("Cash from child class");
	}
	public void Cash(boolean a , int c, int b)
	{
		System.out.println("Cash from child class");
	}
	public void Cash( int c, int b,boolean a )
	{
		System.out.println("Cash from child class");
	}
	
}
