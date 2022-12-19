package com.aspire.java.Logical_Programs;

public class Prime_number 
{
	public static void main(String[] args) 
	{
		int no = 10;
		int temp = 0;
		
		for (int i = 0; i < no; i++) 
		{
			if (no%2==0)
			{
				temp++;
			}
		}
		if(temp>0)
		{
			System.out.println(no + " is NOT a prime number");
		}
		else
		{
			System.out.println(no + " is a prime number");
		}
	}

}
