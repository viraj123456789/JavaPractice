package com.aspire.java.Collections.Sets;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_set 
{
	public static void main(String[] args) 
	{
		LinkedHashSet abc = new LinkedHashSet();
		
		abc.add("Viraj"); 		abc.add(1);
		abc.add("Bhagyashree"); abc.add(2);
		abc.add("Akash");		abc.add(3);
		abc.add("Ayesha");		abc.add(4);
		abc.add("mansi");		abc.add(5);
		
		System.out.println(abc);
		System.out.println(abc.size());
		System.out.println(abc.isEmpty());
		System.out.println(abc.remove(05));
		System.out.println(abc); System.out.println();
		
		System.out.println("Get data with for each loop");
		
		for( Object temp : abc)
		{
			System.out.print(temp + ", ");
		}System.out.println();  System.out.println();
		
		System.out.println("Get data with Iterator while loop");
		Iterator a = abc.iterator();
		while(a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		
	}

}
