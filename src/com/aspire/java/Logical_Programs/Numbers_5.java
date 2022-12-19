package com.aspire.java.Logical_Programs;

//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8

public class Numbers_5 {

	public static void addition()
	{
		for(int row=1; row<=4;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(row+col-1 + " ");
			}
			System.out.println();
		}	

	}
	public static void main(String[] args)
{
System.out.println("hello");
addition();
}

}
