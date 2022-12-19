package com.aspire.java.Collections.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_map 
{
	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm = new <Integer,String> HashMap();
		
		hm.put(1, "Mansi");
		hm.put(2, "Bhagyashree");
		hm.put(3, "Ayesha");
		hm.put(4, "Akash");
		hm.put(5, "Viraj");
		
		System.out.println(hm.get(1));
		System.out.println(hm + ", "); System.out.println(hm.size());
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("ayesha"));
		hm.remove(1);				System.out.println(hm + ", ");
//		hm.put(1, "Mahesh");   System.out.println(hm + ", ");
		System.out.println(hm.replace(2, "bhagyshri")); System.out.println(hm + ", ");
		System.out.println(hm.remove(4, "akash"));System.out.println();
		hm.put(6, "XYZ");  System.out.println(hm + ", ");
		System.out.println(hm.size());
		
		System.out.println("Regular for loop");
		for(int i = 1;i<=hm.size();i++)
		{
			System.out.print(hm.get(i) + ", ");
		}System.out.println(); System.out.println();
		
		System.out.println("for each loop");
		
		for( Entry a :hm.entrySet())
		{
			System.out.print(a +", ");
		}System.out.println(); System.out.println();
		
		System.out.println("for each loop");
		for( Integer b :hm.keySet())
		{
			System.out.print(b +", ");
		}System.out.println(); System.out.println();
		
		System.out.println("for each loop");
		
		for(String c :hm.values())
		{
			System.out.print(c +", ");
		}
		
	}

}
