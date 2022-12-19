package com.aspire.java.Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set 
{
	public static void main(String[] args) 
	{
		HashSet xyz = new HashSet();
		
		xyz.add("Viraj"); 		xyz.add(1);
		xyz.add("Bhagyashree"); xyz.add(2);
		xyz.add("Akash");		xyz.add(3);
		xyz.add("Ayesha");		xyz.add(4);
		xyz.add("mansi");		xyz.add(5);
		
		System.out.println(xyz);
		System.out.println(xyz.size());
		System.out.println(xyz.isEmpty());
		System.out.println(xyz.remove(05));
		System.out.println(xyz); System.out.println();
		
		System.out.println("Get data with for each loop");
		
		for( Object temp : xyz)
		{
			System.out.print(temp + ", ");
		}System.out.println();  System.out.println();
		
		System.out.println("Get data with Iterator while loop");
		Iterator a = xyz.iterator();
		while(a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		
	}

}
