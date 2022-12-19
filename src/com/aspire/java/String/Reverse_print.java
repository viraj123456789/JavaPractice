package com.aspire.java.String;

public class Reverse_print 
{
	public static void main(String[] args) 
	{
		String s="Aspire";       //	O/P- eripsA
//		String[] a=s.split("");
		char[] a = s.toCharArray();

	    for (int i=a.length-1; i>=0; i--)
	    {
	    	System.out.print(a[i]);
	    }
	}
}
