package com.aspire.java.Arrays;

public class Even_Odd 
{
	public static void main(String[] args) 
	{
		int [] a = {11,22,33,44,55,66,77,88,99,100};
		
// even number		
		System.out.println("Even numbers from array a is - ");
		for(int i = 0; i<a.length; i++)    // even number
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+",");
			}
		}	
			System.out.println();System.out.println();
			
// odd number		
		System.out.println("Odd numbers from array a is - ");
		for(int i = 0; i<a.length; i++)    // odd number
		{
			if(a[i]%2!=0)
			{
					System.out.print(a[i]+",");
			}
		}
	}
}
