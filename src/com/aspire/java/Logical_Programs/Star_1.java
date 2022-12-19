package com.aspire.java.Logical_Programs;

//	* * * *                  
//	* * * *
//	* * * *
//	* * * *
//   row=4 col=4

public class Star_1 {

	public static void main(String[] args) 
	{
//		System.out.println("* * * *");
//		System.out.println("* * * *");
//		System.out.println("* * * *");
//		System.out.println("* * * *");
		
		for(int row =1;row<=4; row++)
		{
			for (int col=1; col<=4; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
}


