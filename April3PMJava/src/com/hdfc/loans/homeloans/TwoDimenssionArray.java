package com.hdfc.loans.homeloans;

public class TwoDimenssionArray 
{

	public static void main(String[] args) 
	{
		int[][] a= {
					{1,2,3,4},
					{4,5},
					{7,8,9,10,11}
				  };
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
		
		for(int k[]:a)
		{
			for(int l:k)
			{
				System.out.print(l + "  ");
			}
			System.out.println();
		}
		
		
	}
}