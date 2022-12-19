package com.aspire.java.String;

public class Relational 
{
	public static void main(String[] args) 
	{
		String s0 = "Viraj";
		String s1 = "viraj";
		String s2 = "viraj";
		String s3 = "pansare";
				
		String s4 = new String("viraj");
		String s5 = new String("viraj");
		String s6 = new String("pansare");
		String s7 = new String("Pansare");
		
// verify objects
		System.out.println(s1==s2);		System.out.println(s2==s3);
		System.out.println(s4==s5);		System.out.println(s5==s6);
		
		System.out.println();
		
//verify content of string
		System.out.println(s1.equals(s2));		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s5));		System.out.println(s5.equals(s6));
		System.out.println(s1.equals(s4));		System.out.println(s3.equals(s6));
		
		System.out.println();
// ignoring case sansitive
		System.out.println(s0.equals(s1));
		System.out.println(s0.equalsIgnoreCase(s1));
		
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
	}

}
