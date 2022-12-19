package com.aspire.java.ConditionalStatements;

public class Nested_if_1 {

	public static void main(String[] args) {
		int age=19;
		String gender="Male";
				
		if (age > 18)
		{
			System.out.println("Person is legal voter");
			
			if ( age > 18 )
			{

				if(gender=="Male" && age > 21)
				{
					System.out.println("male have valid age for Marriage");
				}
				
				else
				{
					System.out.println("Female have valid age for Marriage");
				}
			}
			else
			{
				System.out.println("Person don't have valid age for Marriage");
			}
		}
		else
		{
			System.out.println("Person is NOT a legal voter");
		}
		

	}

}
