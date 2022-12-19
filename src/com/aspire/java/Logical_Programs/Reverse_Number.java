package com.aspire.java.Logical_Programs;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number = ");
		int num = scan.nextInt();
		
		int	rev = 0;
		
		for (int a = num ;a!=0 ; a = a/10 )
		{
			int rem = a%10;
			
			rev = rev*10 + rem;
					
		}
		
		System.out.println(rev);
		
	}
	

}
