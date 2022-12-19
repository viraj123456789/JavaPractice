package com.aspire.java.Collections.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_Map_sir {

	public static void main(String[] args) 
	{
        HashMap <Integer, String> hm= new <Integer, String> HashMap();
		
		hm.put(1, "Ram");
		hm.put(2, "Bhavesh");
		hm.put(3, "Mahesh");
		System.out.println(hm);
		System.out.println(hm.containsKey(3));  //true
		System.out.println(hm.containsKey(4));  //false
		System.out.println(hm.containsValue("Ram"));
		System.out.println(hm.containsValue("Raju"));
		System.out.println("Regular for loop");
		for (int i=1; i<=hm.size(); i++)
		{
			System.out.print(hm.get(i)+", ");
		}
		System.out.println();
		System.out.println("for each loop");
		for (Entry<Integer, String> es:hm.entrySet())
		{
			System.out.print(es+", ");
		}
		System.out.println();
		hm.remove(2);
		System.out.println(hm);
		hm.put(5, "Pranjali");
		System.out.println(hm);
		hm.put(1,"Kartik");
		System.out.println(hm);
		//for only values
		for ( String vl:hm.values())
		{
			System.out.print(vl+", ");
		}
		System.out.println();
		//for only keys
		for (Integer ky:hm.keySet())
		{
			System.out.print(ky+", ");
		}
		System.out.println();
		for (int i=1; i<=hm.size()+2; i++)
		{
			System.out.print(hm.get(i)+", ");
		}
	

	}

}
