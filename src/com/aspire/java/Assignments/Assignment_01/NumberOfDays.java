package com.aspire.java.Assignments.Assignment_01;

import java.util.Scanner;

public class NumberOfDays {

	Scanner sc=new Scanner(System.in);
	public void displayMenu()
	{
		
		System.out.println("**********Menu**********");
		System.out.println("*1.JAN");
		System.out.println("*2.FEB");
		System.out.println("*3.MAR");
		System.out.println("*4.APR");
		System.out.println("*5.MAY");
		System.out.println("*6.JUN");
		System.out.println("*7.JUL");
		System.out.println("*8.AUG");
		System.out.println("*9.SEP");
		System.out.println("*10.OCT");
		System.out.println("*11.NOV");
		System.out.println("*12.DEC");
		System.out.println("*13.Exit");
		System.out.println("*************************");
	}
	public int getChoiceAsNum(int m)
	{
		System.out.println("Enter your Choice of month for getting no. of days :-");
		return m=sc.nextInt();
		
	}
	public void getNumberOfDays(int m)
	{
		switch (m) {
		case 1:
			System.out.println("No. of Days in January is 31");
			break;
		case 2:
			System.out.println("No. of Days in February is 28");
			break;
		case 3:
			System.out.println("No. of Days in March is 31");
			break;
		case 4:
			System.out.println("No. of Days in April is 30");
			break;
		case 5:
			System.out.println("No. of Days in May is 31");
			break;
		case 6:
			System.out.println("No. of Days in June is 30");
			break;
		case 7:
			System.out.println("No. of Days in July is 31");
			break;
		case 8:
			System.out.println("No. of Days in August is 31");
			break;
		case 9:
			System.out.println("No. of Days in September is 30");
			break;
		case 10:
			System.out.println("No. of Days in Octomber is 31");
			break;
		case 11:
			System.out.println("No. of Days in November is 30");
			break;
		case 12:
			System.out.println("No. of Days in December is 31");
			break;
		case 13:
			System.out.println("@@@@@@@Exit From Menu@@@@@@@");
			break;

		default:
			System.out.println("!!!!!Wrong Choice!!!!!!");
			break;
		}
		
	}
	public static void main(String[] args) {
		int month=0;
		
		NumberOfDays nod=new NumberOfDays();
		nod.displayMenu();
		month=nod.getChoiceAsNum(month);
		nod.getNumberOfDays(month);
		
		
		

	}

}
