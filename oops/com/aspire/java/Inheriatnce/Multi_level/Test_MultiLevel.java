package com.aspire.java.Inheriatnce.Multi_level;

public class Test_MultiLevel {

	public static void main(String[] args) 
	{
		Child_MultiLevel c = new Child_MultiLevel();
		
		c.Bike();              //child
		c.Mobile();
		System.out.println();
		
		c.Cash();            //parent 2
		c.Land();
		System.out.println();
		
		c.House();           // parent 1
		c.Car();
		
	}

}
