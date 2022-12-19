package com.aspire.java.String;

public class Operations_2_Split 
{
	public static void main(String[] args) 
	{
		String s1 ="Viraj Vitthal Pansare";
		
		String a[]= s1.split(" ");

// for each loop  ------   it can print only in forward order
		
		for(String b:a)
		{
			System.out.print(b + ", ");
		}
		System.out.println();
		
// for reverse/ backward ------- we have to use regular for loop
		
		for(int i = a.length-1; i>= 0; i-- )
		{
			System.out.print(a[i] + ", ");
		}
		
	}

}
