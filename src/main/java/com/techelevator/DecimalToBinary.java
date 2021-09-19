package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		/* This program converts a series of user inputted base 10 integers to their
		* equivalent binary outputs.
		*
		* It requires an array to hold as many powers of two as are needed to complete the
		* calculation. We create this array by
		* 	- first, counting how many index positions the array will need
		* 	- second, creating an array of size n = count
		* 	- third, populating the array with the required powers of two, stored by size
		* 	  from the largest in index 0 to the smallest in the last index.
		*
		* Binary Calculation:
		* To convert decimal to binary we use a for loop to iterate over the array holding the
		* powers of two from largest to smallest. In each instance, we modulo divide the integer
		* input by the greatest power of two less than or equal to the input (for example, if the input
		* is 450, the greatest power of two less than or equal is 256). If the power goes into
		* the input once, we print "1" and assign the remainder to the input. If the power does
		* not go in into the input, we print 0 and the remainder is unchanged. The loop continues
		* until it reaches the final index which has a value of 1, the lowest value of two.
		* This prints out the binary conversion of any valid base 10 integer.*/

		// Create Scanner and prompt user for input
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a series of integers separated by a space: ");
		String inputString = kb.nextLine();

		// Split user input String into a String array
		String[] inputsArray = inputString.split(" ");

		// for loop to iterate through user input
		for (int x = 0; x < inputsArray.length; x++) {

			// Convert input String to an integer
			String decimalString = inputsArray[x];
			int decimal = Integer.parseInt(decimalString);

			// Count how many indices are needed to store the powers of two
			int doubler = 0;
			int count = 0;
			for (int i = 0; doubler <= decimal; i++) {
				if (doubler == 0) {
					doubler++;
				} else {
					count++;
					doubler *= 2;
				}
			}

			// Create an array of size n = count
			int[] powers = new int[count];

			/* Populate the powers array, which we'll use next to
			* modulo divide the decimal input and remainders.*/
			int powerOfTwo = 1;
			for (int i = powers.length - 1; i >= 0; i--) {
				powers[i] = powerOfTwo;
				powerOfTwo *= 2;
			}

			// Modulo division to convert decimal to binary and output
			System.out.print(decimalString + " in binary is ");
			for (int i = 0; i < powers.length; i++) {
				if (decimal >= powers[i]) {
					System.out.print(1);
					decimal = decimal % powers[i];
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}