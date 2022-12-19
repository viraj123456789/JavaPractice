package com.aspire.java.Arrays;

import java.util.Arrays;

public class Sort 
{
	public static void main(String[] args) 
	{
//		int a[] = {100,55,77,99,66,33,11,44,88,22};
		int a[] = {0,1,0,1,1,1,1,0,0,0,1,1,1};
		
		Arrays.sort(a);
		
// Ascending order
		for (int i = 0; i < a.length; i++)       
		{
			System.out.print(a[i] + ", ");
		}
		System.out.println();

// Descending order		
		for (int i = a.length -1; i >=0; i--)       
		{
			System.out.print(a[i] + ", ");
		}
		
	}

}
