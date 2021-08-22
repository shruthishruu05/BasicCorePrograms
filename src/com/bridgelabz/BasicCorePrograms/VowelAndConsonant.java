package com.bridgelabz.BasicCorePrograms;
import java.util.*;
public class VowelAndConsonant {
	public static void main(String[] args) {
		char alphabet;
		System.out.println("enter the alphabet");
		Scanner in = new Scanner(System.in);
		alphabet = in.next().charAt(0);
		
		if(alphabet =='a'||alphabet =='e'||alphabet == 'i'||alphabet == 'o'||alphabet =='u')
		{
			System.out.println("The alphabet is a vowel");
		}
		else
			System.out.println("The alphabet is a consonent");
	}

}


