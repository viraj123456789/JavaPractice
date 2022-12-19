package com.aspire.java.Inheriatnce.Single_level;

public class Test_Single_Level 
{
	public static void main(String[] args) 
	{
		//Child_Single_level
		Child_Single_level c = new Child_Single_level();
		c.Bike();
		c.Cash();
		
		System.out.println();
		
		//Parent_Single_level
		c.Car();
//		c.House();
		c.Land();
		c.House();
	}

}
