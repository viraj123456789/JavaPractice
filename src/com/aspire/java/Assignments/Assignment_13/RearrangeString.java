package com.aspire.java.Assignments.Assignment_13;

import java.util.Scanner;

public class RearrangeString {
		
	static Scanner sc=new Scanner(System.in);
	public static  String getRearrangeString(String name)
	{
		String d = "",s = "",ds;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i))==true)
			{
				d=d+name.charAt(i);
			}
			if(Character.isAlphabetic(name.charAt(i))==true)
			{
				s=s+name.charAt(i);
			}
			
		}
		ds=d+s;
		
		return ds;
	
	}
	public static String getString(String name)
	{
		System.out.println("(To Exit from Program Enter '#')Enter string to Rearrange in AllDigits+AllCharacter Formate :-> ");
		
		 name=sc.next();

		 return name;
	
	}
	
	public static void main(String[] args) {

		String name="",DS;
		do
		{
	    name=getString(name);
	    if(name.equals("#"))
		 {
			 System.out.println("!!!!!!!Exited from Program!!!!!!! ");
			break;
		 }
	    DS=getRearrangeString(name);
		System.out.println("Rearranged in AllDigits+AllCharacter Formate :->"+DS);
		}while(name!=null);
	    }


}
