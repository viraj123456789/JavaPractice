package com.aspire.java.String;

import java.util.ArrayList;
import java.util.Arrays;

public class Incremental_Array 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,1,2,1,2,1,2,1,2,1,2};
		Arrays.sort(a);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int temp:a)
		{			
			ar.add(temp);
		}
		System.out.println(ar);
	}

}
