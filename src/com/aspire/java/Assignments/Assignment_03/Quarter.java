package com.aspire.java.Assignments.Assignment_03;

import java.util.Scanner;

public class Quarter {

	static Scanner sc=new Scanner(System.in);
	public static void repeat(int in)
	{
		System.out.println("#######To Exit From Program please enter '0'######");
		int i;
		do {
			i=getMonthIndex(in);
			if(i>0 && i<=3)
			{
				
				showMonthQuarter(1);
			}
			else if(i>3 && i<=6 )
			{
				showMonthQuarter(2);
			}
			else if(i>6 && i<=9)
				showMonthQuarter(3);
			else if(i>9 && i<=12) 
				showMonthQuarter(4);
			else 
				showMonthQuarter(5);
		}while(i!=0);
		
	}
	public static int getMonthIndex(int i)
	{
		System.out.println("Enter Day Index :-> ");
		
		
		return i=sc.nextInt();
	}
	public static void showMonthQuarter(int m)
	{
		
		switch (m) {
		case 0:
			System.out.println("*******Exit From Program******");
			break;
		case 1:
			System.out.println("FY2022 Q1");
			break;
		case 2:
			System.out.println("FY2022 Q2");
			break;
		case 3:
			System.out.println("FY2022 Q3");
			break;
		case 4:
			System.out.println("FY2022 Q4");
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
