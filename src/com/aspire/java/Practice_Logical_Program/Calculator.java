package com.aspire.java.Practice_Logical_Program;

import java.util.Scanner;

public class Calculator 
{
	static float a, b, result;
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a =");
		a = scan.nextInt();
		System.out.println("Enter value of b =");
		b = scan.nextInt();
		System.out.println("Add  of a & b = " + add(a,b));
		System.out.println("Sub  of a & b = " + Sub(a,b));
		System.out.println("Mult of a & b = " + mult(a,b));
		System.out.println("Div  of a & b = " + div(a,b));
	}
	public static float add(float a ,float b)
	{
		result = a+b;
		return result;
	}
	public static float Sub(float a ,float b)
	{
		result = a-b;
		return result;
	}
	public static float mult(float a ,float b)
	{
		result = a*b;
		return result;
	}
	public static float div(float a ,float b)
	{
		result = a/b;
		return result;
	}
}
