package com.techelevator;

import java.util.Scanner;

public class DB03 {

    public static void main(String[] args) {

        // Create Scanner and prompt user for input
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int decimal = kb.nextInt();

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
        System.out.println();

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
        for (int i = 0; i < powers.length; i++) {
//            System.out.print(i + " ");
//            System.out.print(powers[i] + " ");
//            System.out.print(decimal + " ");
            if (decimal > powers[i]) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
            decimal = decimal % powers[i];
        }
    }
}
