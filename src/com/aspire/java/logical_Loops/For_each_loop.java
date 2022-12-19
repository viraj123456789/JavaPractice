package com.aspire.java.logical_Loops;

public class For_each_loop 
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
		
		
	}	

}
