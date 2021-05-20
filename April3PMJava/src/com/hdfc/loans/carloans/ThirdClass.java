package com.hdfc.loans.carloans;

public class ThirdClass 
{
	
	int eno;
	String ename;
	
	public void info(int no,String name)
	{
		eno=no;
		ename=name;
		System.out.println(eno + "----" + ename);
	}
	
	public static void main(String[] args) 
	{
		ThirdClass obj = new ThirdClass();
		
		obj.eno=1;
		obj.ename="rk";
		
		obj.info(10,"ravilella");
		
		obj.info(100, "sai");
	}
}
