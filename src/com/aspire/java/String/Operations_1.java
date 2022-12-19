package com.aspire.java.String;

public class Operations_1 
{
	public static void main(String[] args) 
	{
		String s1 ="Viraj Vitthal Pansare";
		String s2 = "sangamner", s3 = " ";
		
		
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(0, 5));
		
		System.out.println(s1+s3+s2);
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.concat(s3.concat(s2)));
		
		System.out.println(s2.replace('s', 'S'));
		System.out.println(s2.replace("sangamner", "Sangamner"));
		
		
		
		
	}

}
