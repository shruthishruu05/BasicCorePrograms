package com.bridgelabz.BasicCorePrograms;

public class LeapYear {
	public static void main(String [] args)
	{
		int year = 2000;
		if(Integer.toString(year).length()==4)
		{
			if((year%4==0 && year%100!=0)||year%400==0)
			{
				System.out.println("The given year " +year+ " is a leap year");
			}
			else
			{
				System.out.println("The given year is not a leap year");
			}
		}
		else
		{
			System.out.println("Enter a four digit number");
		}
		
	}
}


