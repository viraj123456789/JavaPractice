package com.aspire.java.Assignments.Assignment_03;

import java.util.Scanner;

public class WeekEnd_WeekDay {
	
	static Scanner sc=new Scanner(System.in);
	public static void repeat(int in)
	{
		System.out.println("#######To Exit From Program please enter '0'######");
		int i;
		do {
			i=getDayIndex(in);
			if(i>0 && i<=5)
			{
				
			getDay(2);
			}
			else if(i>5 && i< 8 )
			{
				getDay(1);
			}
			else if(i==0)
				getDay(0);
			else 
				getDay(9);
			
		}while(i!=0);
		
	}
	public static int getDayIndex(int i)
	{
		System.out.println("Enter Day Index :-> ");
		
		
		return i=sc.nextInt();
	}
	public static void getDay(int m)
	{
		
		switch (m) {
		case 0:
			System.out.println("*******Exit From Program******");
			break;
		case 1:
			System.out.println("WeekEnd");
			break;
		case 2:
			System.out.println("WeekDay");
			break;
		
		default:
			System.out.println("!!!!!Invalid Index!!!!!!");
			break;
		}
		
		
	}
	public static void main(String[] args) {
		
		int indexD=0;
		
		repeat(indexD);
		
	}

}
