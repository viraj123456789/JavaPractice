package com.aspire.java.polymorphism.overriding;

public class Test_OR 
{
	public static void main(String[] args) 
	{
		Child_OR OR = new Child_OR();
		OR.method1();
		OR.method2();
		OR.method3();
		
		System.out.println();
		
		Parent_OR or = new Parent_OR();
		or.method1();
		or.method2();
		or.method3();
	}

}
