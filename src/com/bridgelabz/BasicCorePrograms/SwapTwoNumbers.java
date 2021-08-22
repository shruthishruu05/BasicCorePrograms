package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int num1 ,num2,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = in.nextInt();
		System.out.println("Enter the second number");
		num2 = in.nextInt();
		System.out.println("the numbers before swapping "+num1+ " and " +num2 );
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The numbers after swapping "+num1+ " and " +num2 );
	
	}
}


