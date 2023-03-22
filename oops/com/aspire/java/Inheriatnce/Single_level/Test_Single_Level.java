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
		System.out.println();
		main(10);
		
	}
	public static void main(int vira) 
	{
		int  b = 20, cd;
		cd= vira+b;
		System.out.println(cd);
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
