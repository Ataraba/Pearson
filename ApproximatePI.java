package chapter_one;

//#ATarabaTechSoftware#
//Created by: Alex Taraba
//Created on: 8/19/2024 @ 0926
//This program will display the approximation of PI twice, using two mathematical formulas

// Begin ApproximatePI class
public class ApproximatePI {

	// Begin main(String[] args) method
	public static void main(String[] args) {
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
	} // End main(String[] args) method
} // End ApproximatePI class
