package com.bridgelabz.BasicCorePrograms;

public class PowerOf2 {
	public static void main(String [] args)
	{
		int powerValue = Integer.parseInt(args[0]);
		
		if(powerValue<0 || powerValue>30)
		{
			System.out.println("The range must be 0<= powerValue< 31 since 2^31 overflows an int");
		}
		else
		{
			for(int index = 0;index<powerValue;index++)
			{
				System.out.println("the power of 2^"+index+ " is "+Math.pow(2,index));
			}
			int year = (int)Math.pow(2,powerValue);
			if((year%4==0 && year%100!=0)||(year%400 ==0))
			{
				System.out.println("The given year is a leap year");
			}
			else
			{
				System.out.println("The given year is not a leap year");
			}
		}
	}
}

	


