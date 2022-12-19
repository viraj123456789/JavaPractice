package com.aspire.java.Collections.Lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_list 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Viraj");		v.add("Mansi");
		v.add("Bhagyashree");		v.add("Ayesha");
		v.add("Mansi G");
		
		System.out.println(v);
		System.out.println(v.get(3));
		v.add(1, "Akash");		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(3));
		System.out.println(v.remove("Mansi G"));
		System.out.println(v); System.out.println();
		
		System.out.println("Get data with Regular for loop");
		for(int i = 0;i<=v.size()-1; i++)
		{
			System.out.print(v.get(i) + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with for each loop");
		for(Object a:v)
		{
			System.out.print(a + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with Iterator");
		Iterator a = v.iterator();
		while (a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		System.out.println(); System.out.println();
		
		System.out.println("Get data with List Iterator");
		ListIterator ls= v.listIterator();
// forward direction data		
		while(ls.hasNext())
		{
			System.out.print(ls.next() + ", ");
		}System.out.println(); System.out.println();
// backward direction data		
		while(ls.hasPrevious())
		{
			System.out.print(ls.previous() + ", ");
		}System.out.println(); System.out.println();
		
		System.out.println("Get data with Enumeration");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.print(enu.nextElement() + ", ");
		}
		
	}

}
