package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner in  = new Scanner(System.in);
		int number = in.nextInt();
			
		System.out.println("Prime Factors are");
		while(number%2==0) {
			System.out.print("2 ");
			number = number/2;
		}
			
		for(int index=3;index<=number;index+=2)
		{
			while(number%index==0) {
				System.out.print(index +" ");
				number = number/index;
			}
		}
	}
	
}


