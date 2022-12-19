package com.aspire.java.ConditionalStatements;

public class Nested_if_2 {

	public static void main(String[] args) {

		String UName="Hemant";
		String password="Hemant@123";
		
		if (UName =="Hemant")
		{
			System.out.println("User name is correct");
			if (password=="Hemant@12")
			{
				System.out.println("Password is correct");
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Password is Wrong");
			}
		}
		else
		{
			System.out.println("User name is Wrong, enter valid User Name");
		}

	}

}
