package com.hdfc.loans.carloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance (or) instance-global (or) non-static variable
	static String cname ="vmware"; // static (or) static-global variable
	static VariableTypes obj ;
	
	public void m1()
	{
		int x=200; // local variable
		//System.out.println(y);
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
	}
	
	public static void main(String[] args) 
	{
		//Reference variable
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
