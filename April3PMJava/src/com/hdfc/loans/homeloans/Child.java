package com.hdfc.loans.homeloans;

class Parent
{
	public Number workhard()
	{
		System.out.println("Parent : wakeup early, goto college....");
		return 0;
	}
	
	public void care()
	{
		System.out.println("atmost care....");
	}

}

public class Child extends Parent
{
	public  Object workhard()
	{
		System.out.println("Child : wakeup anytime, goto bar...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("iam in love....");
	}

	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.workhard();
		p.care();
		
		Child obj = new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}

}
