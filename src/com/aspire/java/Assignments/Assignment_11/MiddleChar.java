package com.aspire.java.Assignments.Assignment_11;

import java.util.Scanner;

public class MiddleChar {
	
	static Scanner sc=new Scanner(System.in);
	public static  char getMiddleChar(String name)
	{
		int len=name.length();
		int mid=len/2;
		return	name.charAt(mid);
	
	}
	public static String getString(String name)
	{
		System.out.println("Enter string to find the lenght of string :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="";
		char mid=' ';
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    mid=getMiddleChar(name);
		System.out.println("Middle Character from given String is :->"+mid);
		}while(name!=null);
	    }

}
