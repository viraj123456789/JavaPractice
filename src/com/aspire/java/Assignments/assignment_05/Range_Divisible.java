package com.aspire.java.Assignments.assignment_05;

import java.util.Scanner;

public class Range_Divisible {
	
	static Scanner sc=new Scanner(System.in);
	static public  int getStartRange(int s)
	{
		System.out.println("Enter Start Range From where Divisible Number's Start :-");
		return s=sc.nextInt();
		
	}
	static public  int getEndRange(int e)
	{
		System.out.println("Enter End Range Upto where Divisible Number's End :-");
		return e=sc.nextInt();
	}
	static public void getDisplayDivisibleFive(int s,int e)
	{
		System.out.println("Divisible by 5  number from "+s+" to "+e+" are :");
		for (int i = s; i <= e; i++) {
			if(i%5==0)
			{
				System.out.println(i);
			}
			
		}
	}
	static public void getDisplayDivisibleThree(int s,int e)
	{
		System.out.println("Divisible by 3  number from "+s+" to "+e+" are :");
		for (int i = s; i <= e; i++) {
			if(i%3==0)
			{
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0,end=0;
		start=getStartRange(start);
		end=getEndRange(end);
		getDisplayDivisibleFive(start,end);
		getDisplayDivisibleThree(start,end);
	}

}
