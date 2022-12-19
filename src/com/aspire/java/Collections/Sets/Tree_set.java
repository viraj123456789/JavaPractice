package com.aspire.java.Collections.Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set 
{
	public static void main(String[] args) 
	{
		TreeSet	 lmn = new TreeSet();
		
		lmn.add("Viraj"); 		//lmn.add(1);
		lmn.add("Bhagyashree"); //lmn.add(2);
		lmn.add("Akash");		//lmn.add(3);
		lmn.add("ayesha");		//lmn.add(4);
		lmn.add("Mansi");		//lmn.add(5);
//		lmn.add(null);        // java.lang.NullPointerException
		System.out.println(lmn);
		System.out.println(lmn.size());
		System.out.println(lmn.isEmpty());
		System.out.println(lmn.remove("Viraj"));
		System.out.println(lmn); System.out.println();
		
		System.out.println("Get data with for each loop");
		
		for( Object temp : lmn)
		{
			System.out.print(temp + ", ");
		}System.out.println();  System.out.println();
		
		System.out.println("Get data with Iterator while loop");
		Iterator a = lmn.iterator();
		while(a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		
	}

}
