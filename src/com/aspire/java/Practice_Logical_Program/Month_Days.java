package com.aspire.java.Practice_Logical_Program;

import java.util.Scanner;

public class Month_Days {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month Number = ");
		int mon = scan.nextInt();
		switch(mon) {
		case 1 :
			System.out.println("January = 31");
			break;
		case 2 :
			System.out.println("February = 28");
			break;
		case 3 :
			System.out.println("March = 31");
			break;
		case 4 :
			System.out.println("April = 30");
			break;
		case 5 :
			System.out.println("May = 31");
			break;	
		case 6 :
			System.out.println("June = 30");
			break;
		case 7 :
			System.out.println("July = 31");
			break;
		case 8 :
			System.out.println("Auguest = 31");
			break;
		case 9 :
			System.out.println("September = 30");
			break;
		case 10 :
			System.out.println("Octomber = 31");
			break;
		case 11 :
			System.out.println("November = 30");
			break;
		case 12 :
			System.out.println("December = 31");
			break;
		default :
			System.out.println("Invalid Entry");
		}
	}

}
