package com.aspire.java.Arrays;

public class TwoD {

	public static void main(String[] args) 
	{
		//approach 1
//				int [][] a= { {11,12,'a',14}, {15,16,17,18}, {19,20,21,22}};   //size=3*4
		char [][] a= { {'a','b','c','d'}, {'A','B','C','D'}, {'e','f','g','h'}};
			
				
				for(int row = 0; row < a.length; row++)
				{
					for(int col = 0; col <a[row].length; col++)
					{
						System.out.print(a[row][col] + " ");
					}
					System.out.println();
				}
				
				System.out.println();
				
		int [][] b= { {'a','b','c','d'}, {'A','B','C','D'}, {'e','f','g','h'}};
				
		for(int row = 0; row < b.length; row++)
		{
			for(int col = 0; col <b[row].length; col++)
			{
//				System.out.print(b[row][col] + " ");
				if(b[row][col]<=100 )
				{
					System.out.print(b[row][col] + "  ");
				}
				else
				{
					System.out.print(b[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

}
