package com.bridgelabz.BasicCorePrograms;

public class FlipCoin {
	public static void main(String[] args) 
	{
		int numOfFlipCoin = 10;
		int headCount = 0;
		for(int index =0;index<numOfFlipCoin;index++)
		{
			if(numOfFlipCoin<=0)
			{
				System.out.println("The Number must be a positive Integer");
			}
			else
			{
				if((Math.random() < 0.5))
				{
					headCount++;
				}
			}
		}
		int headPercentage = (headCount*100)/numOfFlipCoin;
		int tailPercentage = 100 - headPercentage;
		System.out.println("The headPercentage is:" +headPercentage);
		System.out.println("The tail percentage is:" +tailPercentage);
		
	}
}
