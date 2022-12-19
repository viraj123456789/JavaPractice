package com.aspire.java.Casting.Non_Primitive;

public class Test_NP {

	public static void main(String[] args) 
	{
		Parent_NP p = new Parent_NP();
		p.method1();
		p.method2();
		p.method3();
		p.method4();
		
		System.out.println();
		
		Child_NP c = new Child_NP();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.child();
		
		System.out.println();
		
		// upcasting
		Parent_NP cp = new Child_NP();
		cp.method1();
		cp.method2();
		cp.method3();
		cp.method4();
		
	
	}

}
