package com.hdfc.loans.carloans;

public  class B extends A // ISA Relationship
{
	public void m1()
	{
		System.out.println("iam overriden m1 in ClassB");
	}	
	
	public void m2()
	{
		System.out.println("iam m2 in ClassB");
	}
	
	
	
	public static void main(String[] args) 
	{
		A a = new A();  // HASA Relationship
		a.m1();
		
		B b =  new B();
		b.m2();
		b.m1();
		
		A obj = new B();
		obj.m1();
		
		
		
	}

}
