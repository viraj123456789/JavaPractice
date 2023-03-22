package com.aspire.java.Assignments.Assignment_01;

public class StringDigitSeprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Man12ge456SH@78";
		
		String digit="",low="",upper="",spe="";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))==true)
			{
				System.out.print(i);
			}
			
		}
		
	}

}
