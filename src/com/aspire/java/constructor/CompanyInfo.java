package com.aspire.java.constructor;

public class CompanyInfo
{
	//intsnace variables
		String eName;    //intsnace variables
		long eMob;
		String email;
		//static variables
		static String companyName; // ="Aspire Pvt. Ltd";
		static String CEOName; //   ="Mr. Mahesh Sir";
		
		public void companyData() 
		{
			System.out.println(eName);
			System.out.println(eMob);
			System.out.println(email);
			System.out.println(companyName);
			System.out.println(CEOName);
			System.out.println();
		}

}
