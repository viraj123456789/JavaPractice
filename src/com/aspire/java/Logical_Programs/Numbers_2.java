package com.aspire.java.Logical_Programs;

//	1
//	23
//	345
//	4567

public class Numbers_2 
{
	public static void main(String[] args)
	{
		for(int row=1; row<=4;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+row-1);
			}
			System.out.println();
		}
	}

}
