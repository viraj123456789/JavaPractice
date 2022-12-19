package com.aspire.java.Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Viraj");		al.add("Mansi");
		al.add("Bhagyashree");		al.add("Ayesha");
		al.add("Mansi G");
		
		System.out.println(al);
		System.out.println(al.get(3));
		al.add(1, "Akash");		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		System.out.println(al.remove("Mansi G"));
		System.out.println(al); System.out.println();
		
		System.out.println("Get data with Regular for loop");
		for(int i = 0;i<=al.size()-1; i++)
		{
			System.out.print(al.get(i) + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with for each loop");
		for(Object a:al)
		{
			System.out.print(a + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with Iterator");
		Iterator a = al.iterator();
		while (a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		System.out.println(); System.out.println();
		
		System.out.println("Get data with List Iterator");
		ListIterator ls= al.listIterator();
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
		
	}

}
