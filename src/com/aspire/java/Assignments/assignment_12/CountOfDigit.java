package com.aspire.java.Assignments.assignment_12;

import java.util.Scanner;

public class CountOfDigit {

	static Scanner sc=new Scanner(System.in);
	public static  int getCountOfDigit(String name)
	{
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i))==true)
			{
				count++;
			}
			
		}
		
		return count;
	
	}
	public static String getString(String name)
	{
		System.out.println("(To Exit from Program Enter '#')Enter string to find count of Digit's :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="";
		int even;
		;
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    even=getCountOfDigit(name);
		System.out.println("Count of Digit's are :->"+even);
		}while(name!=null);
	    }


}
