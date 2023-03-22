package com.aspire.java.Assignments.Assignment_01;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :->");
		int no=sc.nextInt();
		int org=no;
		int rev=0,rem=0;
		while(no>0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;	
		}
		System.out.println("Reverse No is :->"+rev);
	}

}
