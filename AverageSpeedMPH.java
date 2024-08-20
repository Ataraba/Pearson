package chapter_one;

//#ATarabaTechSoftware#
//Created by: Alex Taraba
//Created on: 8/19/2024 @ 1120
//This program will calculate and display an average speed based on a runner that runs 14 kilometers in 45 minutes and 30 seconds

// Begin AverageSpeedMPH class
public class AverageSpeedMPH {

	// Begin main(String[] args) method
	public static void main(String[] args) {
		
		// 1 mile = 1.6 kilometers, convert time to seconds then back to hours for MPH
		System.out.println("Average Speed MPH: " + ((14.0 / 1.6) / 2730) * 60 * 60);
	} // End main(String[] args) method
	
} // End AverageSpeedMPH class
