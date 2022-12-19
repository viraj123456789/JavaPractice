package com.aspire.java.Logical_Programs;

import java.util.Scanner;

public class Swap_Integer 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your s1 =");
		int s1 = scan.nextInt(); 
		System.out.println();
		
		System.out.print("enter your s2 =");
		int s2 = scan.nextInt();
		System.out.println();
		
//		int s1 = 10;
//		int s2 = 20;
		int temp;
		System.out.println("s1 = " + s1);
		System.out.println("s2 = "+ s2);
		
		System.out.println();
		temp = s2;
		s2 = s1;
		
		s1 = temp;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = "+ s2);
		
	}

}
