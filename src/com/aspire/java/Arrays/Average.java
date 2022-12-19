package com.aspire.java.Arrays;

public class Average 
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50,50,40,30,20,10};
		int add = 0;
//		int l = a.length;
		
		for(int i=0; i<a.length;i++)
		{
			add = add + a[i];
		}
		System.out.println("Average of Array a is = " + add/a.length);
		
//		System.out.println("Average of Array a is = " + add/l);
		
	}

}
