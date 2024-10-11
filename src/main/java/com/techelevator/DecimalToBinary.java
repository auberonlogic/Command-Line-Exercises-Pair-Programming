package com.techelevator;

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// prompt user for input
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String decimals = scan.nextLine();
		String[] decimalArray = decimals.split(" ");

		// iterate over each element of user input
		for (int i = 0; i < decimalArray.length; i++) {
			int num = Integer.parseInt(decimalArray[i]);

			// instantiate a list of Integers to hold the bits in reverse order
			List<Integer> bits = new ArrayList<>();

			System.out.print("\n" + num + " in binary is ");

			// determine the bits and add them to the list
			for (int j = num; num > 0; num /= 2) {
				int bit = num % 2;
				bits.add(bit);
			}

			// print the bits in the correct order
			for (int k = bits.size() - 1; k >= 0; k--) {
				System.out.print(bits.get(k));
			}
		}
	}
}
