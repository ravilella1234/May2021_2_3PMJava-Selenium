package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class SingleDimensionArray 
{
	
	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int aSize = sc.nextInt();
		
		int[] a = new int[aSize];
		int sum=0;
			
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];	
		}
		System.out.println("Sum of the array is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		/*
		 * int[] a = {10,20,30,40};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]="+ a[i]); }
		 */
		
		SingleDimensionArray obj = new SingleDimensionArray();
		int count = obj.m1();
		System.out.println("Count of Array is : " + count);
	}

}
