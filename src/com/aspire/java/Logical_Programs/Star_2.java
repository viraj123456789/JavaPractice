package com.aspire.java.Logical_Programs;

// *          r1 = c1
// **		r2 = c2
// ***		r3 = c3 
// **** 	r4 = c4
// row = 4 col = 4

public class Star_2 
{
	public static void main(String[] args)
	{
		for (int row=1; row<=4; row++)
		{ 
		  for (int col=1; col<=row; col++)        // *
		  {
			System.out.print("* ");
		  }
		    System.out.println();
	    }
	}	

}
