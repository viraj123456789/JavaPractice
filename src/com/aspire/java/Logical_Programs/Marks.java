package com.aspire.java.Logical_Programs;

public class Marks 
{
	public static void main(String[] args) 
	{

		int marks=41;
		int crirerion=40;
		
		do 
		{
			if (marks >= crirerion)
			{
				System.out.println("Student Result is Pass with " + marks);
				//marks--;
				break;
			}
			else
			{
				System.out.println("Student Result is Fail");
				marks++;
			}
			
			
		}
		
		while (marks > crirerion); //&& marks>=100);
		
		
		    
	}

}
