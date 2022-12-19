// CAR- Swift- ZDi+,ZDi, VDi, LDi

package com.aspire.java.ConditionalStatements;

public class Else_if_2 {

	public static void main(String[] args) 
	{

		int Cash= 800000;
		int base_price=650000;
		
		if (Cash>=1250000)
		{System.out.println("you can buy  Zdi+ ");}
		
		else if(Cash >=100000)
		{System.out.println("you can buy Swift ZDi");}
		
		else if (Cash >=750000)
		{System.out.println("you can buy Swift VDi");}
		 
		else if (Cash>=base_price) 
		{System.out.println("you can buy Swift LDi");}
		
		else
		{System.out.println("Dont Buy Car");}
	}

}
