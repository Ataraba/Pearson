package chapter_one;

//#ATarabaTechSoftware#
//Created by: Alex Taraba
//Created on: 8/20/2024 @ 1013
//This program will calculate and display an average speed based on a runner that runs 24 miles in 1 hour, 40 minutes, and 35 seconds

// Begin AverageSpeedKPH class
public class AverageSpeedKPH {

	// Begin main(String[] args) method
	public static void main(String[] args) {
		
		// Convert miles to kilometers
		double kilometers = 24 * 1.6;
		// Convert time to seconds
		int seconds = (1 * 60 * 60) + (40 * 60) + 35;
		// Determine KPH
		double kph = (kilometers / seconds) * 60 * 60;
		
		// Print to display
		System.out.println("KPH: " + kph);

	} // End main (String[] args) method
	
} // End AverageSpeedKPH class
