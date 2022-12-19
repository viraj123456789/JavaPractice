package com.aspire.java.Collections.Lists;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list 
{
	public static void main(String[] args) 
	{
		LinkedList lkl = new LinkedList();
		lkl.add("Viraj");		lkl.add("Mansi");
		lkl.add("Bhagyashree");		lkl.add("Ayesha");
		lkl.add("Mansi G");
		
		System.out.println(lkl);
		System.out.println(lkl.get(3));
		lkl.add(1, "Akash");		System.out.println(lkl);
		
		System.out.println(lkl.size());
		System.out.println(lkl.isEmpty());
		System.out.println(lkl.get(3));
		System.out.println(lkl.remove("Mansi G"));
		System.out.println(lkl); System.out.println();
		
		System.out.println("Get data with Regular for loop");
		for(int i = 0;i<=lkl.size()-1; i++)
		{
			System.out.print(lkl.get(i) + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with for each loop");
		for(Object a:lkl)
		{
			System.out.print(a + ", ");
		}System.out.println();System.out.println();
		
		System.out.println("Get data with Iterator");
		Iterator a = lkl.iterator();
		while (a.hasNext())
		{
			System.out.print(a.next() + ", ");
		}
		System.out.println(); System.out.println();
		
		System.out.println("Get data with List Iterator");
		ListIterator ls= lkl.listIterator();
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


