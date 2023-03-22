package com.aspire.java.Assignments.assignment_07;

import java.util.Scanner;

public class Divi3and7 {
	
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
	static public void getDisplayDivisibleThreeandSeven(int s,int e)
	{
		int count=0;
		System.out.println("Divisible by 3 and 7 number from "+s+" to "+e+" are :");
		for (int i = e; i >s; i--) {
			
			if(i%3==0 && i%7==0)
			{
				count++;
				System.out.println(i);
				if(count==3)
					break;
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0,end=0;
		start=getStartRange(start);
		end=getEndRange(end);
		getDisplayDivisibleThreeandSeven(start,end);
		
	}


}
