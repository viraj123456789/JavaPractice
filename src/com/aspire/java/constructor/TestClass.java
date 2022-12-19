package com.aspire.java.constructor;

public class TestClass {

	public static void main(String[] args) 
	{
		CompanyInfo Viraj = new CompanyInfo();
		Viraj.eName="Viraj Pansare";
		Viraj.eMob=1234567890;
		Viraj.email="viraj@gmail.com";
		CompanyInfo.companyName="Aspire Pvt. Ltd";
		CompanyInfo.CEOName="Mr. Mahesh Sir";
		
		Viraj.companyData();
				
		CompanyInfo Mansi = new CompanyInfo();
		Mansi.eName="Mansi Golhar";
		Mansi.eMob=987654320;
		Mansi.email="manasi@gmail.com";
//		CompanyInfo.companyName="Aspire Pvt. Ltd";
//		CompanyInfo.CEOName="Mr. Mahesh Sir";
		
		Mansi.companyData();
		
		CompanyInfo Adinath = new CompanyInfo();
		Adinath.eName="Adinath Patil";
		Adinath.eMob=5454545;
		Adinath.email="Adi@gmail.com";
		Adinath.companyData();
		
		CompanyInfo Bhagyashri= new CompanyInfo();
		Bhagyashri.eName= "Bhagyashri Lokhande";
		Bhagyashri.eMob= 9874562310l;
		Bhagyashri.email= "xyz@xyz.com";
		Bhagyashri.companyData();
		
		CompanyInfo Ayesha = new CompanyInfo();
		Ayesha.eName="Ayesha Khan";
		Ayesha.eMob=21365478901l;
		Ayesha.email="abc@abc.com";
		Ayesha.companyData();
	
	

	}

}
