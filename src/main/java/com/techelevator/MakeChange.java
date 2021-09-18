package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	// written by Evan Swartz

	public static void main(String[] args) {
	Scanner keyboard = new Scanner((System.in));
	System.out.print("Please enter total amount of bill:");
	String billTotalAmount = keyboard.nextLine();
	double totalAmountToDouble = Double.parseDouble(billTotalAmount);
	System.out.println("Please enter amount tendered:");
	String tenderedUserEntered = keyboard.nextLine();
	double tenderToDouble = Double.parseDouble(tenderedUserEntered);
	double changeBack = (totalAmountToDouble - tenderToDouble);
		System.out.println("This is the change required:" + " " + changeBack);
	}

}
