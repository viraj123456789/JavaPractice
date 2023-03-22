package com.aspire.java.Arrays;

import java.util.Arrays;

public class OneD {

	public static void main(String[] args) 
	{
		int [] a = new int[6];      // array creation
		a[0] = 99;
		a[1] = 22;
		a[2] = 77;
		a[3] = 44;
		a[4] = 55;
		a[5] = 66;
//		a[6] = 11;     it will give Exception - Array Index OutofBound
		
//		int [] a = {22,11,33,55,99,66,88,77,44};
		Arrays.sort(a);
		System.out.println(a[5]);
		
		for(int x = 0; x<a.length; x++)
		{
			System.out.print(a[x] + " ");
		}
		System.out.println();
		
		
		Object x[] = new Object[5];
		x[0]='a';
		x[1]=1;
		x[2]=true;
		x[3]="viraj";
		x[4]=6.66;
		
		System.out.println(x[2]);
		for(int a1 = 0; a1<x.length; a1++)
		{
			System.out.print(x[a1] + " ");
		}
		System.out.println();
		
	}

}
