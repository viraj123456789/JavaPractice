package com.aspire.java.Inheriatnce.Multiple;

public class Test_class extends Child1
{

	public static void main(String[] args) 
	{
		Test_class o = new Test_class();
//		Child1 o = new Child1();
		o.method1();
		o.method1("Addition");
		o.method1(10,20);
		
		System.out.println();
		
		o.method2();
		o.method2("Substraction");
		o.method2(20, 10);
	
		
	}

}
