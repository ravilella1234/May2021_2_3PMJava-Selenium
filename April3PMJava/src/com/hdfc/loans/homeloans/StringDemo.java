package com.hdfc.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		System.out.println(s1.substring(2, 7));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "Ravikanth";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "ravikan"; 
		System.out.println(s1.contains(s4));
		
		//s1 = s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s5 = " ravikanth";
		System.out.println(s5);
		System.out.println(s5.trim());
		
		System.out.println(s5.replace('r', 'k'));
		
		String s6 = "ravi kanth lella";
		String[] str = s6.split(" ");
		for(String s : str)
		{
			System.out.println(s);
		}
		
		String s7 = "ravikanth";
		System.out.println(s7.startsWith("rav"));
		System.out.println(s7.endsWith("nth"));
		
		String s8 = "ravikanth ";
		String s9 = " Ravikanth";
		System.out.println(s8.equals(s9));
		System.out.println(s8.trim().equalsIgnoreCase(s9.trim()));
	}

}
