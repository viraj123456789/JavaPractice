package com.aspire.java.methods;

import com.aspire.java.methods_Diff_Package.Para_Ret_Diff_Pack;
public class Parameters_Return {

	public static void main(String... viraj)       //var-arg method
					    	//instead of args we can write down any valid identifier
	{
		//static method - Parameterized
		multi(10,20);
		
		//instance method- Non-Parameterized
		Parameters_Return PR_object = new Parameters_Return();
		//System.out.println("Division = " + PR_object.div());
		PR_object.div();
		
		//static method - Parameterized with return
		System.out.println("add = "+method(12,13));
		
		//instance method diff pack- Parameterized with return
		Para_Ret_Diff_Pack DP_object= new Para_Ret_Diff_Pack();
		System.out.println("addition = " +DP_object.addition(22,22));
		
		//static method diff pack - non Parameterized with return
		System.out.println("substraction = "+ Para_Ret_Diff_Pack.sub());

	}
	
	//static method - Parameterized
	
	public static void multi(int a, int b)
	{
		int c= a*b;
		System.out.println("Multiplication = " + c);
	}
	
	//instance method- Non-Parameterized
	
	public int div()
	{
		int x=100;
		int y=10;
		int z=x/y;
		System.out.println("Division = "+z);
		return z;
		
	}
	
	public static int method(int p,int q)
	{
		int r=p+q;
		return r;
	}
}
