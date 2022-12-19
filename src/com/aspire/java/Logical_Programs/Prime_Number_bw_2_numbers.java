package com.aspire.java.Logical_Programs;

public class Prime_Number_bw_2_numbers 
{
	public static void main(String[] args) 
	{
		int lower =1;
		int upper =50;
		
		for (int i = lower; i <=upper; i++) 
		{
			int count=0;
			for(int j = 2;j<i ; j++)
			{
				if(i%j==0)
				{
					count++;
					break;
					
				}
			}
			if(count==0)
			{
				System.out.print(i+", ");
			}
			
		}
		
		
	}

}
