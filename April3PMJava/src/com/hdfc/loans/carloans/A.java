package com.hdfc.loans.carloans;

import java.util.Date;

public abstract  class A 
{
	public static final String cname = "vmware";
	
	public  void m1()
	{
		
		System.out.println("iam m1 in ClassA");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static method...");
	}
	
	public abstract void m6();
	
	static
	{
		System.out.println("iam static block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) 
	{		
		A a = new A();
		a.m1();
		
		m5();
	}

}
