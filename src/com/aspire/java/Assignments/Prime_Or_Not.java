package com.aspire.java.Assignments;

import java.util.Scanner;

public class Prime_Or_Not {

	static Scanner sc = new Scanner(System.in);

	static public int getNumbner(int s) {
		System.out.println("Enter Number to find Prime or not :-");
		return s = sc.nextInt();

	}

	static public boolean showPrimeOrNot(int no) {
		for (int i = 2; i < no / 2; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void ShowResult(boolean p, int no) {
		if (p == true)
			System.out.println(no + " Number is a Prime number");
		else
			System.out.println(no + " Number is not a Prime number");
	}

	public static void main(String[] args) {

		int no = 0;
		do {
			no = getNumbner(no);
			if (no < 0) {
				System.out.println("!!!!!!!!Invalid Number!!!!!!");
				break;
			}

			boolean p = showPrimeOrNot(no);
			ShowResult(p, no);
		} while (no > 0);

	}

}
