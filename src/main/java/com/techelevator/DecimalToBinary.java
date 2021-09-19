package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		/* This program converts a series of user inputted base 10 integers to their
		* equivalent binary outputs.
		* The user is prompted to enter a series of integers separated by spaces (inputString).
		* The integers are stored as a String, then split into a String array (inputsArray).
		* A for loop iterates through the elements of inputsArray and performs
		* the following steps:
		* 		- First, the currently indexed integer String (inputsArray[i]) is converted to an int named decimal.
		* 		- Second, an int named doubler is initialized to 1 and an int named count is initialized to 0.
		* 		- Third, a for loop iterates so long as doubler is smaller than decimal. This will produce a power
		*         of two that goes into decimal exactly one time.
		* 		- Each iteration, doubler will be multiplied by 2 and count will be incremented by 1.*/

		// Create Scanner and prompt user for input
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a series of integers separated by a space: ");
		String inputString = kb.nextLine();
		String[] inputsArray = inputString.split(" ");

		for (int x = 0; x < inputsArray.length; x++) {
			String decimalString = inputsArray[x];
			int decimal = Integer.parseInt(decimalString);

			/* doubler will store the value that will be checked against the user input to determine
			 * the number of powers of two less than the input number
			 * count will track how many indices are necessary in the powers array*/
			int doubler = 1;
			int count = 0;
			for (int i = 0; doubler < decimal; i++) {
				count ++;
				doubler *= 2;
//            System.out.print(count + " ");
//            System.out.print(doubler + " ");
			}

			// Creates an array of size n = count
			int[] powers = new int[count];

			/*Create variable to store the powers of two values we'll use to populate the powers array,
			 * which we'll use later to do the modulo division with the decimal input.*/
			int powerOfTwo = 1;
			for (int i = powers.length - 1; i >= 0; i--) {
				powers[i] = powerOfTwo;
				powerOfTwo *= 2;
			}

			// modulo division to convert decimal to binary
			System.out.print(decimalString + " in binary is ");
			for (int i = 0; i < powers.length; i++) {
//            System.out.print(i + " ");
//            System.out.print(powers[i] + " ");
//            System.out.print(decimal + " ");
				if (decimal >= powers[i]) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
				decimal = decimal % powers[i];
			}
			System.out.println();
		}


	}
}
