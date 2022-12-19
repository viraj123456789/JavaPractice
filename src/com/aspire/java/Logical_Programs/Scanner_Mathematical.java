package com.aspire.java.Logical_Programs;

import java.util.Scanner;

public class Scanner_Mathematical 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Put Valua of a = ");
		float a = scan.nextInt();
		System.out.println("Put Valua of b = ");
		float b = scan.nextInt();
//		String s1 = scan.next();
//		System.out.println(s1);
		
		float p, q,r,s;
		p=a+b;
		q=a-b;
		r=a*b;
		s=a/b;
		
		System.out.println("Additionsion of " + a + " & "+b+" = "+p);
		System.out.println("Subtraction of " + a + " & "+b+" = "+q);
		System.out.println("Multiplication of " + a + " & "+b+" = "+r);
		System.out.println("Division of " + a + " & "+b+" = "+s);
		
	}

}
