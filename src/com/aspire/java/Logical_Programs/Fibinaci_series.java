package com.aspire.java.Logical_Programs;

public class Fibinaci_series 
{
	public static void main(String[] args)
	{
		int [] a = new int [10];
		a[0]=0;
		a[1]=1;
		
		for (int i = 2; i < a.length; i++) 
		{
			a[i]=a[i-1]+a[i-2];
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+", ");
		}
		
	}

}
