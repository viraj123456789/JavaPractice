package com.aspire.java.Assignments.assignment_04;

import java.util.Scanner;

public class Score {
static Scanner sc=new Scanner(System.in);
	public static void processResult()
	{
		int score=0,i;
		
		do
		{	
			
			score=getScore(score);
		if(score>=0 && score<=49)
		{
			System.out.println("Failed as obtained mark is "+score+" work harder");
			
		}
		else if(score>=50 && score<=100)
		{
			System.out.println("Student could clear exam");
		 if(score>=90 && score<=100)
		{
			System.out.println("A+, very good job");
		}
		else if(score>=80 && score<=89)
		{
			System.out.println("A, very good job");
		}
		else if(score>=70 && score<=79)
		{
			System.out.println("B+, you are improving");
		}
		else if(score>=60 && score<=69)
		{
			System.out.println("C+, keep reading");
		}
		else if(score>=50 && score<=59)
		{
			System.out.println("C, you can do better");
		}
		}
		else
		{
			System.out.println("!!!!!!Invalid Marks!!!!!");
		}
		
		}while(score<100);
	}
	public static int getScore(int m) {
		System.out.println("Enter Score obtained by student :->");
		return m=sc.nextInt();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
processResult();
	}

}
