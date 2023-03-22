package com.aspire.java.Assignments.assignment_12;

import java.util.Scanner;

public class SumOfDigits {
	static Scanner sc=new Scanner(System.in);
	public static  int getSumOfDigit(String name)
	{
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i))==true)
			{
				char ch=name.charAt(i);
				int num=Character.getNumericValue(ch);		
				sum=sum+num;
				
			}
			
		}
		
		return sum;
	
	}
	public static String getString(String name)
	{
		System.out.println("(To Exit from Program Enter '#')Enter string to get sum of Digit's :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="";
		int sum;
		;
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    sum=getSumOfDigit(name);
		System.out.println("Sum of Digit's are :->"+sum);
		}while(name!=null);
	    }



}
