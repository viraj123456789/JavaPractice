package com.aspire.java.Exception_Handle;
import java.util.TreeSet;
public class General 
{
	public static void main(String[] args) 
	{
		int [] a = {5,4,3,2,1};
		String [] b = {"Viraj", "Mansi", "Akash", "Bhagyashri", "Ayesha", "Viraj", "Mansi"};
		int x =10, y=0 ;
		try 
		{
			System.out.println(a[4]);
			System.out.println("TreeSet");
			TreeSet ts =  new TreeSet();  TreeSet ts1 =  new TreeSet();
			for( int i = 0;i<a.length;i++)
			{
				ts.add(a[i]);
			}
			for (int j = 0;j<b.length;j++)
			{
				ts.add(b[j]);
			}
			System.out.print(ts + ", ");	System.out.println();
			System.out.println(a[5]);
			int c= x/y;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("we can not devide with 0");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("give valid index");
		}
		catch(ClassCastException e)
		{
			System.out.println("we can not get heterogenious data in TreeSet");
		}
	System.out.println(a[2]);
	}
	

}
