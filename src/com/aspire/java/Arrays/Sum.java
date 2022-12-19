package com.aspire.java.Arrays;

public class Sum 
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50,50,40,30,20,10};
		int add = 0;
		
		
		for(int i = a.length-1; i>=0; i--)    // reverse order
		{
			add = add + a[i];
		}
		System.out.println("Sum of array a is = " + add);
		
	}

}
