package com.aspire.java.String;

public class Content 
{
	public static void main(String[] args) 
	{
		String s1 ="Viraj Vitthal Pansare";
		String s2 ="viraj", s3 = " ", s4="";
		
		System.out.println(s1.length());		System.out.println(s2.length());
		System.out.println(s3.length());		System.out.println();
		
		System.out.println(s1.contains(s3));	
		System.out.println(s1.contains("V"));
		System.out.println(s1.toLowerCase().contains(s2));   
		System.out.println();
		
		System.out.println(s3.isEmpty());  	    System.out.println(s4.isEmpty());
		System.out.println();
		
		System.out.println(s1.charAt(10));
		char a = s1.charAt(6);					System.out.println(a);
		System.out.println();
		
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.endsWith("re"));  System.out.println();
		
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.toLowerCase().startsWith(s2)); 
		System.out.println();
		
		System.out.println(s1.indexOf('a'));  	System.out.println(s1.indexOf('V'));
		System.out.println(s1.lastIndexOf('a'));  
		System.out.println(s1.lastIndexOf('V'));
				
	}

}
