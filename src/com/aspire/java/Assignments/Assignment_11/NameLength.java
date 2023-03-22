package com.aspire.java.Assignments.Assignment_11;

import java.util.Scanner;

public class NameLength {
	
	static Scanner sc=new Scanner(System.in);
	public static  int getNameLenght(String name)
	{
		return name.length();
		
	}
	public static String getString(String name)
	{
		System.out.println("Enter string to find the lenght of string :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		int lenght;
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    lenght=getNameLenght(name);
		System.out.println("Lenght of given String is :->"+lenght);
		}while(name!=null);
	    }
	

}
