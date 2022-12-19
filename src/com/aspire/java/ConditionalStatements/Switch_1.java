package com.aspire.java.ConditionalStatements;
// January=1, February=2, March=3, April=4, May=5, June=6, 
// July=7, August=8, September=9, October=10, November=11, December=12 
public class Switch_1 
{
	public static void main(String[] args)
	{
	int Month=12;
	switch(Month)
	 	{
	case 1:
			System.out.println("This is January");
			break;
	case 2:
			System.out.println("This is February");
			break;
	case 3:
			System.out.println("This is March");
			break;
	case 4:
			System.out.println("This is April");
			break;
	case 5:
			System.out.println("This is May");
			break;	
	case 6:
			System.out.println("This is June");
			break;
	case 7:
			System.out.println("This is July");
			break;
	case 8:
			System.out.println("This is August");
			break;
	case 9:
			System.out.println("This is September");
			break;
	case 10:
			System.out.println("This is October");
			break;
	case 11:
			System.out.println("This is November");
			break;
	case 12:
			System.out.println("This is December");
			break;
		default:
			System.out.println("Invalid Entry");
	 	}
	
	}

}
