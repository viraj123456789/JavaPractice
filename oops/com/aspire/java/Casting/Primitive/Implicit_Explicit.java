package com.aspire.java.Casting.Primitive;

public class Implicit_Explicit 
{
	public static void main(String[] args) 
	{
		byte a = 127;
		short b = 15;
		int c;
		long d;
		double e = 100.1532648;
		
		a= (byte) b;       // explicit --- typcast b into byte 
		
		b=a;     // implicit ----- typcast a into short
		
		d=a;   // implicit ------- typcast a into long
		
		c=(int) e;    // explicit ------ typecast e into int
		
		d = (long) e;  // explicit ---- typecast e into long    == long d = (long) e
		
		c = a;     // implicit------ typecast a into int
		
		System.out.println("hello to byte = "+ a );
		System.out.println("hello to short = "+ b );
		System.out.println("hello to int = "+ c );
		System.out.println("hello to long = "+ d );
		System.out.println("hello to double = "+ e );
		System.out.println("hello to addition = "+ (c+d));
	}

}
