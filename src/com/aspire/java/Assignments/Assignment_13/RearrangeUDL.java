package com.aspire.java.Assignments.Assignment_13;

import java.util.Scanner;

public class RearrangeUDL {
	
	static Scanner sc=new Scanner(System.in);
	public static  String getRearrangeString(String name)
	{
		String u = "",l = "",d="",udl;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i))==true)
			{
				d=d+name.charAt(i);
			}
			if(Character.isUpperCase(name.charAt(i))==true)
			{
				u=u+name.charAt(i);
			}
			if(Character.isLowerCase(name.charAt(i))==true)
			{
				l=l+name.charAt(i);
			}
			
		}
		udl=u+d+l;
		
		return udl;
	
	}
	public static String getString(String name)
	{
		System.out.println("(To Exit from Program Enter '#')Enter string to Rearrange in Upper+Digit+Lower Formate :-> ");
		
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
		System.out.println("Rearranged in Upper+Digit+Lower Formate :->"+DS);
		}while(name!=null);
	    }



}
