package com.aspire.java.methods;

import com.aspire.java.methods_Diff_Package.Instance_Method_Diff_Package;

public class Instance_Method_Same_class 
{
	public static void main(String[] args)
	{
		System.out.println("This is Main Method");
		System.out.println();
		
//	 	Instance method same Class
		Instance_Method_Same_class SC_Object = new Instance_Method_Same_class();
		SC_Object.method1();
		SC_Object.method2();

//	 	Instance method Diff Class
		Instance_Method_Diff_class DC_Object = new Instance_Method_Diff_class();
		DC_Object.method3();
		DC_Object.method4();
		
//	 	Instance method Diff Package
		Instance_Method_Diff_Package DP_Object = new Instance_Method_Diff_Package();
		DP_Object.method5();
		DP_Object.method6();
		
	
	}
	
	public void method1()
	{
		System.out.println("Instance method 1 Same Class");
	}
	
	public void method2()
	{
		System.out.println("Instance method 2 Same Class");
		System.out.println();
	}

}
