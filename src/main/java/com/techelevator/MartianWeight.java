package com.techelevator;

import java.util.Scanner;

public class MartianWeight {

		public static void main(String[] args) {

			// written by Ryan Theerman
			// this program prompts the user for a series of weights on Earth,
			// converts them to weights on Mars, and prints the results of the conversion.

			// create scanner and prompt user for input
			Scanner kb = new Scanner(System.in);
			System.out.print("Please enter a series of weights" +
					" separated by spaces: ");

			// user enters series of weights
			String seriesOfWeights = kb.nextLine();

			// convert String inputs to String array and split everything separated by a " "
			String[] weights = seriesOfWeights.split(" ");

			// for loop iterates through array and calculates the weight on Mars for each index,
			// then prints the relative values.
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


