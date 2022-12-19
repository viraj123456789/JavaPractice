package com.aspire.java.Logical_Programs_Strings;

public class OneUpperCase_OneLowerCase 
{
	public static void main(String[] args) 
	{
		String a = "viraj";
		String b = a.toUpperCase();
		char [] temp = new char[a.length()];
		
		for (int i = 0; i < a.length(); i++) 
		{
			if (i%2==0)
			{
				temp[i]=b.charAt(i);
			}
			else
			{
				temp[i]=a.charAt(i);
			}
		}
		System.out.println(temp);
		
	}

}
