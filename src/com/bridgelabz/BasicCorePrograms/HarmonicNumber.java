package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		double result=0;
		if(number!=0)
		{
			for(int index=1;index<=number;index++)
			{
				result += (double)1/index;
				
			}
			System.out.println("The harmonic value of "+number+" is " +result);
		}
		else
		{
			System.out.println("Enter a number which is not equal to 0");
		}
		

	}
}


