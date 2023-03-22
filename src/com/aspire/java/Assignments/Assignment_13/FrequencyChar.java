package com.aspire.java.Assignments.Assignment_13;

import java.util.Scanner;

public class FrequencyChar {
	
	static Scanner sc=new Scanner(System.in);
	public static  int getFrequencyOfChar(String name ,char charec)
	{
		
		int count = 0;
		for(int i=0;i<name.length();i++)
		{
			if(charec==name.charAt(i))

			{
				count++;
				
			}
			
		}
		
		
		return count;
	
	}
	public static String getString(String name)
	{
		System.out.println("Enter string  :-> ");
		
		 name=sc.nextLine();

		 return name;
	
	}
	public static char getChar()
	{
		char ch;
		System.out.println("Enter Character to find Frequency in string :-> ");
		
		 ch=sc.next().charAt(0);

		 return ch;
	
	}
	
	public static void main(String[] args) {

		String name="";
		char charec;
		int freq;
	
	    name=getString(name);

	    charec=getChar();
	    freq=getFrequencyOfChar(name,charec);
		System.out.println("Count of '"+charec+"' in given string:-> "+freq);
	
	    }


}
