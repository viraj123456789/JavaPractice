package com.aspire.java.dataTypes;

public class Datatypes_2 
{
	public static void main(String [] args)
	{
		byte a=0127;
		short b=032767;
		int c=2147483647; //2,147,483,647
		long d=9223372036854775807l;
		float e=-2147483647;
		double f=0922337203685477580800046468735137684351354684d;
		char g='A';
		char h='d';
		boolean i=true, j=false;
		
		double x=(a*b+c*d+e-f+g*h);
		
		System.out.println(x);
		System.out.println(i);
		System.out.println(j);
		
		double y=(double)f/d;
		double z = b%a;
		System.out.println(y);
		System.out.println(z);
	}
}
