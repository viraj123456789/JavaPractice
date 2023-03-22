package com.aspire.java.Assignments.assignment_12;

import java.util.Scanner;

public class ReverseString {

	static Scanner sc=new Scanner(System.in);
	public static  String getReverseString(String name)
	{
		String rev="";
		for(int i=0;i<name.length();i++)
		{
			char r=name.charAt(i);
			rev=r+rev;
			
		}
		
		return rev;
	
	}
	public static String getString(String name)
	{
		System.out.println("(For Exit Enter '#')Enter string to in Reverse Form :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="",rev="";
		
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    rev=getReverseString(name);
		System.out.println("Reverse form of given String is :->"+rev);
		}while(name!=null);
	    }



}
