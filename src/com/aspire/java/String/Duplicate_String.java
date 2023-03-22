package com.aspire.java.String;

public class Duplicate_String {
	public static void main(String[] args) 
	{
		String s1 = "Great responsibility Mansi";
		int count;

		char[] s2 = s1.toCharArray();

		System.out.println("Duplicate char in Srting : ");
		for (int i = 0; i < s2.length; i++) 
		{
			count = 1;
			for (int j = i; j < s2.length; j++) 
			{
				if (s2[i] == s2[j] && s2[i] != ' ' && i != j) 
				{
					count++;
					s2[j] = '0';
				}
			}
			if (count > 1 && s2[i] != '0')
				System.out.println(s2[i]);
		}
	}
}
