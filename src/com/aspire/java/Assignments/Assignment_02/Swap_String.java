package com.aspire.java.Assignments.Assignment_02;

import java.util.Scanner;

public class Swap_String {
	static Scanner sc=new Scanner(System.in);
	public static void swap(String a,String b)
	{
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());	
		System.out.println("After Swapping  'a' = " +a+" 'b' = "+b);
		
	}
	public static String getString(String a)
	{	
		System.out.println("Enter String :- ");
		return a=sc.next();
	}
	
	public static void display(String a,String b)
	{
		System.out.println("Before Swapping String's are  'a' = " +a+" 'b' = "+b);
		
	}
	
		public static void main(String[] args) {
			
			String a = null,b = null;
		   a= getString(a);
		   b= getString(b);
			display(a, b);
			swap(a, b);	
			
		}

	}


