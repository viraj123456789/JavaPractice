package com.aspire.java.Assignments.assignment_05;

import java.util.Scanner;

public class Range_Sum {
	
	static Scanner sc=new Scanner(System.in);
	static public  int getStartRange(int s)
	{
		System.out.println("Enter Start Range From where Sum of Number's Start :-");
		return s=sc.nextInt();
		
	}
	static public  int getEndRange(int e)
	{
		System.out.println("Enter End Range Upto where Sum of Number's End :-");
		return e=sc.nextInt();
	}
	static public void getDisplaysum(int s,int e)
	{
		int sum=0;
		System.out.println("Addition of  number from "+s+" to "+e+" are :");
		for (int i = s; i <= e; i++) {
			
			
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0,end=0;
		start=getStartRange(start);
		end=getEndRange(end);
		getDisplaysum(start,end);
		
	}

}
