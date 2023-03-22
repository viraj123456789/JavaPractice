package com.aspire.java.Practice_Logical_Program;

import java.util.Scanner;

public class Quarters 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Month Number : ");
		int mon = scan.nextInt();
		if(mon<=3)
		{
			System.out.println("FY2023 Q1");
		}
		else if(mon>3 && mon <=6 )
		{
			System.out.println("FY2023 Q2");
		}
		else if(mon>6 && mon <=9)
		{
			System.out.println("FY2023 Q3");
		}
		else if(mon>9 && mon <=12)
		{
			System.out.println("FY2023 Q4");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
