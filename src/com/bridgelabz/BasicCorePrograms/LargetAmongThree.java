package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class LargetAmongThree {
	public static void main(String[] args) {
		int number1,number2,number3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1 = in.nextInt();
		System.out.println("Enter the second number");
		number2 = in.nextInt();
		System.out.println("Enter the third number");
		number3 = in.nextInt();
		
		int temp;
		temp = number1>number2?number1:number2;
		int largest = temp>number3?temp:number3;
		System.out.println("The Largest number is "+largest);
		
	}
	

}


