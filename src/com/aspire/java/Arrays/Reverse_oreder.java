package com.aspire.java.Arrays;

public class Reverse_oreder {

	public static void main(String[] args) 
	{
		int [] a = {11,22,33,44,55,66,77,88,99,100};
		
		System.out.println("Reverse order of array a is - ");
		for(int i = a.length-1; i>=0; i--)    // reverse order  i-- = i-=1 / i = i-1
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		
		
	}

}
