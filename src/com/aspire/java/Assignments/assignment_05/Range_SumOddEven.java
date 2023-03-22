package com.aspire.java.Assignments.assignment_05;

import java.util.Scanner;

public class Range_SumOddEven {
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
	static public void getDisplaySumDiff(int s,int e)
	{
		int sum=0,even=0,odd=0;
		System.out.println("Difference between sum of Odd and Even numbers from "+s+" to "+e+" are :");
		for (int i = s; i <= e; i++) {
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
			
			
		}
		sum=odd-even;
		System.out.println("Sum is "+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0,end=0;
		start=getStartRange(start);
		end=getEndRange(end);
		getDisplaySumDiff(start,end);
		
	}

}
