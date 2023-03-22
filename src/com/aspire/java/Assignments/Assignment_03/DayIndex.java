package com.aspire.java.Assignments.Assignment_03;

import java.util.Scanner;


public class DayIndex {

	static Scanner sc=new Scanner(System.in);
	public static void repeat(int in)
	{
		System.out.println("#######To Exit From Program please enter '0'######");
		int i;
		do {
			i=getDayIndex(in);
			getDay(i);
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
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
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
