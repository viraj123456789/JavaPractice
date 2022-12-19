package com.aspire.java.methods;

import com.aspire.java.methods_Diff_Package.Static_Method_Diff_Package;

public class Static_Method_Same_Class {

	public static void main(String[] args) 
	{
		System.out.println("This is Main Method");
		System.out.println();
		
		// 	static method same class
		method1();
		method2();
		
		//	static method diff class
		Static_Method_diff_Class.method3();
		Static_Method_diff_Class.method4();
		
		//	static method diff package
		
		Static_Method_Diff_Package.method5();
		Static_Method_Diff_Package.method6();
		
	}
		
	public static void method1()
	{
		System.out.println("Static method 1 Same Class");
	}
	
	public static void method2()
	{
		System.out.println("Static method 2 Same Class");
		System.out.println();
	}

}
