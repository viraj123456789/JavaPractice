package com.aspire.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Combined_List_Set 
{
	public static void main(String[] args) 
	{
		int a [] = {1, 2, 3, 2, 1};
		String [] b = {"Viraj", "Mansi", "Akash", "Bhagyashri", "Ayesha", "Viraj", "Mansi"};
		
		System.out.println("Array List");
		ArrayList al = new ArrayList();
		for( int i = 0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			al.add(b[j]);
		}
		System.out.print(al + ", ");System.out.println(); System.out.println();
		
		System.out.println("Linked List");
		LinkedList ll =  new LinkedList();
		for( int i = 0;i<a.length;i++)
		{
			ll.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			ll.add(b[j]);
		}
		System.out.print(ll + ", ");System.out.println(); System.out.println();

		System.out.println("Vector - (Legacy class)");
		Vector v =  new Vector();
		for( int i = 0;i<a.length;i++)
		{
			v.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			v.add(b[j]);
		}
		System.out.print(v + ", ");System.out.println(); System.out.println();
		
		System.out.println("HashSet");
		HashSet hs =  new HashSet();
		for( int i = 0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			hs.add(b[j]);
		}
		System.out.print(hs + ", ");System.out.println(); System.out.println();

		System.out.println("LinkedHashSet");
		LinkedHashSet lhs =  new LinkedHashSet();
		for( int i = 0;i<a.length;i++)
		{
			lhs.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			lhs.add(b[j]);
		}
		System.out.print(lhs + ", ");System.out.println(); System.out.println();
		
		System.out.println("TreeSet");
		TreeSet ts =  new TreeSet();  TreeSet ts1 =  new TreeSet();
		for( int i = 0;i<a.length;i++)
		{
			ts.add(a[i]);
		}
		for (int j = 0;j<b.length;j++)
		{
			ts1.add(b[j]);
		}
		System.out.print(ts + ", ");
		System.out.println();
		System.out.print(ts1 + ", ");
	}

}
