package com.aspire.java.Assignments.assignment_05;

import java.util.Scanner;

public class Rang_Odd_Reverse {

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
		int sum=0,odd=0,a[];
		System.out.println(" Odd numbers from "+s+" to "+e+" are in reverse form :");
		for (int i = e; i >= s; i--) {
			if(i%2!=0)
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
		getDisplaySumDiff(start,end);
		
	}
}
