package com.aspire.java.Assignments.Assignment_02;

import java.util.Scanner;

public class Swap_Variables {

	
	static Scanner sc=new Scanner(System.in);
	
	public static int getNumber(int a)
	{	
		System.out.println("Enter Number for variable :- ");
		return a=sc.nextInt();
	}
	
	public static void display(int a,int b)
	{
		System.out.println("Before Swapping  are  'a' = " +a+" 'b' = "+b);
		
	}
	public static void swap(int a, int b)
	{
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swapping  'a' = " +a+" 'b' = "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b=0;
		a=getNumber(a);
		b=getNumber(b);
		display(a, b);
		swap(a,b);
		
		
	}

}
