package chapter_one;

//#ATarabaTechSoftware#
//Created by: Alex Taraba
//Created on: 8/19/2024 @ 1642
//This program will is hard-coded to show a five year population projection using the following data:
//Beginning Population: 312,032,486
//Birth-rate: 1 birth every 7 seconds
//Death-rate: 1 death every 13 seconds
//Immigration-rate: 1 immigrant every 45 seconds
//Exponential Growth Formula: Pt = P0(ert)

// Begin PopulationProjection class
public class PopulationProjection {

	// Begin main(String[] args) method
	public static void main(String[] args) {
		
		// Declare and initialized known variables
		int begPop = 312032486;
		int yearSeconds = 365 * 24 * 60 * 60;
		double yearGrowthRate = (yearSeconds / 7.0 - yearSeconds / 13.0 + yearSeconds / 45.0) * 100 / begPop;
		
		double yearOnePop = begPop + (Math.E * yearGrowthRate * 1.0);
		double yearTwoPop = yearOnePop + (Math.E * yearGrowthRate * 2.0);
		double yearThreePop = yearTwoPop + (yearGrowthRate * 3.0);
		double yearFourPop = yearThreePop + (yearGrowthRate * 4.0);
		double yearFivePop = yearFourPop + (yearGrowthRate * 5.0);
		
		
		System.out.println(yearGrowthRate);
		System.out.println("Year one: " + yearOnePop);
		System.out.println("Year two: " + yearTwoPop);
		System.out.println("Year three: " + yearThreePop);
		System.out.println("Year four: " + yearFourPop);
		System.out.println("Year five: " + yearFivePop);
		
	} // End main(String[] args) method
	
} // End PopulationProjection class
