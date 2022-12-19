package com.aspire.java.mocks;

public class Array_Duplicate 
{
	public static void main(String[] args) 
	{
		
		int []a = {1,2,3,1,2,3}; 
		int count = 0;
		for (int i = 0; i <a.length ;i++)
		{
			for(int j=i; j<a.length; j++)
				{
					if(a[i]==a[j] && i!=j )
					{
							System.out.print(a[j]+ ", ");
							count++;
					}
				}
		}
		System.out.println();
		System.out.println(count);

	}

}
