package com.techelevator;

import java.util.Scanner;

public class DB01 {
/* Decimal to binary
   Write a command-line program which prompts the user for a series of decimal integer values
   separated by spaces. Each decimal integer is displayed along with its equivalent binary value.

   Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
   460 in binary is 111001100
   8218 in binary is 10000000011010
   1 in binary is 1
   31313 in binary is 111101001010001
   987654321 in binary is 111010110111100110100010110001*/

    public static void main(String[] args) {

        // this program (for now) takes a single integer input from the user
        // and converts it to binary.

        // create Scanner and prompt user for input
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        String inputString = kb.nextLine();

        // convert String to int
        // gonna have to do something with String[] and split for multiple inputs. later.
        int inputInt = Integer.parseInt(inputString);

        // powerOfTwo will hold the greatest power of 2 which is still less than the input
        // This loop checks increasing powers of two against the input.
        // When the calculated power of two exceeds the input, the prior power of two is
        // stored for use outside the loop. The loop ends.
        int powerOfTwo = 0;
        for (int initPOT = 1; initPOT <= inputInt;) {
            initPOT = initPOT * 2;
            powerOfTwo = initPOT;
            if(initPOT > inputInt) {
                powerOfTwo = powerOfTwo / 2;
                break;
            } else {
                System.out.println(initPOT);
            }
        }
        System.out.println("final stored value: " + powerOfTwo);

        // not sure how to describe this yet
        // lol also not sure how to write it.
        // this section will convert the input from decimal to binary
        for (int remainder = inputInt; powerOfTwo > 2;) {
            if (remainder % powerOfTwo == 0) {
                remainder = remainder % powerOfTwo;
                System.out.print(remainder + " ");
//				System.out.print(1 + " ");
            } else {
                remainder = remainder % powerOfTwo;
                System.out.print(remainder + " ");
//				System.out.print(0 + " ");
            }
            powerOfTwo = powerOfTwo / 2;
        }
        System.out.println("\n\nEND OF PROGRAM");

    }
}
