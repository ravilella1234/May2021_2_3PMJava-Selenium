package com.hdfc.loans.homeloans;

import com.hdfc.loans.carloans.B;

public class C extends B
{
	public void m3()
	{
		System.out.println("iam m3 in ClassC");
	}

	public static void main(String[] args) 
	{	
		C c = new C();
		c.m1();
		c.m3();
	}

}
