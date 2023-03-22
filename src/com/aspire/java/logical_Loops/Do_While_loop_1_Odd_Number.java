package com.aspire.java.logical_Loops;

public class Do_While_loop_1_Odd_Number {

	public static void main(String[] viraj) 
	{
	
//		int i=1;
// Parameterize method with return type
		odd(1);

	}
	public static int odd(int i)
	{		
		do
		{
			System.out.print(i + ", ");
			i=i+2;
		}
		
		while(i<=50);
		return i;
	}

}
