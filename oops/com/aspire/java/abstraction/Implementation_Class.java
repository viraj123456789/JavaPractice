package com.aspire.java.abstraction;

public class Implementation_Class implements Xyz, Xyz1 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}

	public static void main(String[] args) {
		Implementation_Class i = new Implementation_Class();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
		i.m5();
		i.m6();
		i.m7();
		i.m8();

	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("Abc m5");
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("Abc m6");
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		System.out.println("Abc m7");
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		System.out.println("Abc m8");
	}

}
