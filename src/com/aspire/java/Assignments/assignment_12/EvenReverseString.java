package com.aspire.java.Assignments.assignment_12;

import java.util.Scanner;

public class EvenReverseString {
	
	static Scanner sc=new Scanner(System.in);
	public static  String getEvenCharReverse(String name)
	{
		String even="";
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
			char r=name.charAt(i);
			even=r+even;
			}
			
		}
		
		return even;
	
	}
	public static String getString(String name)
	{
		System.out.println("(To Exit from Program Enter '#')Enter string to get Even Character's :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="",even;
		;
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    even=getEvenCharReverse(name);
		System.out.println("Even Character in Reverse form :->"+even);
		}while(name!=null);
	    }


}
