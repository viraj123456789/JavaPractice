package com.aspire.java.polymorphism.overloading;

public class Test {

	public static void main(String[] args) 
	{
		Parent o = new Parent();
		o.viraj();
		o.viraj(10);  //  byte
		o.viraj('v');
		o.viraj(20);  // short
		o.viraj(50l);
		o.viraj(10, 20);
		o.viraj(true);
		o.viraj(10.20f);  // float will execute when we will write down the f otherwise it take double
		o.viraj(20.20d);  // double
		o.viraj(50);
		
		//Parent ch = new Child();
		
	}

}
