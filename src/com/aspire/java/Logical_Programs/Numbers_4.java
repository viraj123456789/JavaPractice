package com.aspire.java.Logical_Programs;

//1  2  3  4  5
//6  7  8  9  10 
//11 12 13 14 15
//16 17 18 19 20 

public class Numbers_4 
{

	public static void main(String[] args) 
	{
		for(int row=1; row<=20;row+=5)
		{
			for(int col=1;col<=5;col++)
				{
					System.out.print(row+col-1 );
					if (row+col-1 <= 10)
					{
						System.out.print("  ");
					}
					
					else
						
					{
						System.out.print(" ");
					} 
				}
					System.out.println();
				
		 }
    }
}