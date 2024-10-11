package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);

//		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
//		String decimals = scan.nextLine();
//		String[] decimalArray = decimals.split(" ");

//		for (int i = 0; i < decimalArray.length; i++) {
//			int num = Integer.parseInt(decimalArray[i]);

			// how do I convert a decimal to binary?
			// divide the number by 2 and note the remainder as the least significant bit
			// divide the quotient by 2 and note the remainder as the next significant bit
			// repeat until the quotient is 0 and note the remainder as the most significant bit.


//		}

		int num;
		for (num = 254; num > 0; num /= 2) {
 			int bit = num % 2;
			System.out.println(bit);
		}

	}

}
