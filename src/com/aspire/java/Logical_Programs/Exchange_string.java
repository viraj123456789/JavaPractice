package com.aspire.java.Logical_Programs;

public class Exchange_string 
{
	public static void main(String[] args) 
	{
		String s1 = "Viraj";
		String s2 = "Mansi";
		String temp = s1;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = "+ s2);
		
		System.out.println();
		
		s1= s2 ;
		s2 = temp;
		System.out.println("s1 = " + s1);
		System.out.println("s2 = "+ s2);
		
	}

}
