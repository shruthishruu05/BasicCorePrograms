package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class EvenOrOdd {
	public static void main(String [] args)
	{
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		number = in.nextInt();
		if(number%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("the given number is odd");
		}
	}
}


