package com.aspire.java.Practice_Logical_Program;

import java.util.Scanner;

public class Month_Else_if {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month Number = ");
		int mon = scan.nextInt();
		if (mon == 1) {
			System.out.println("January = 31");
		}

		else if (mon == 2) {
			System.out.println("February = 28");
		} else if (mon == 3) {
			System.out.println("March = 31");
		} else if (mon == 4) {
			System.out.println("April = 30");
		} else if (mon == 5) {
			System.out.println("May = 31");
		} else if (mon == 6) {
			System.out.println("June = 30");
		} else if (mon == 7) {
			System.out.println("July = 31");
		} else if (mon == 8) {
			System.out.println("Auguest = 31");
		} else if (mon == 9) {
			System.out.println("September = 30");
		} else if (mon == 10) {
			System.out.println("Octomber = 31");
		} else if (mon == 11) {
			System.out.println("November = 30");
		} else if (mon == 12) {
			System.out.println("December = 31");
		} else {
			System.out.println("Invalid Entry");
		}
	}
}
