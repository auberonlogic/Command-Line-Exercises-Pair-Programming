package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

// Wm = We* 0.378
		public static void main(String[] args) {

			// written by Ryan Theerman

			// create scanner and prompt user for input
			Scanner kb = new Scanner(System.in);
			System.out.print("Please enter a series of weights" +
					" separated by spaces: ");

			// user enters series of weights
			String seriesOfWeights = kb.nextLine();

			// convert String inputs to String array and split everything separated by a " "
			String[] weights = seriesOfWeights.split(" ");

			// for loop iterates through array and calculates the weight on Mars for each index
			// prints the relative values.
			for (int i = 0; i < weights.length; i++) {
				String earthWeightString = weights[i];
				int earthWeightInt = Integer.parseInt(earthWeightString);
				double marsWeightDouble = earthWeightInt * 0.378;
				int marsWeightInt = (int)marsWeightDouble;

				System.out.println(earthWeightInt + " lbs. on Earth, is " + marsWeightInt +
						" lbs. on Mars");
			}
		}
	}


