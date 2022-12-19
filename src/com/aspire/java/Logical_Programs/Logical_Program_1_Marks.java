package com.aspire.java.Logical_Programs;

public class Logical_Program_1_Marks {

	public static void main(String[] args)
	{
		int marks=95;
		int crirerion=40;
		
		do 
		{
			if (marks >= crirerion )
			{
				System.out.println("Student Result is Pass with "+ marks );
				marks++;
			}
			else
			{
				System.out.println("Student Result is Fail");
				marks++;
			}
			
			
		}
		
		while (marks > crirerion && marks<=100);
	}

}
