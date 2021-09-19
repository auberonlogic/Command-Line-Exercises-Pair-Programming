package com.techelevator;

public class DB02 {

    public static void main(String[] args) {

        /*attempt 2: trying to solve problem by inputting an integer, looping a doubler
        * from 1 until it's larger than the int, and storing each iteration of the loop
        * in the int variable count.
        * count tells me how large an array I need to hold all the powers of two necessary to
        * calculate the binary equivalent of the inputted integer.
        * Another loop assigns powers of 2 from the end of the array to the beginning*/

        /*Test value is 450 --- binary output should be 111000010.
        * This will be user input later and, even later, a string of user input
        * split and converted to ints*/

        int decimal = 450;

        System.out.println("Test value is " + decimal);
        System.out.println("Binary output should be 111000010\n");

        /*doubler will store the value that will be checked against the user input to determine
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

        // TEST shows that powers of 2 are correctly indexed
        for (int i = 0; i < powers.length; i++) {
            System.out.print(powers[i] + " ");
        }
        System.out.println();

        // modulo division to convert decimal to binary

        for (int i = 0; i < powers.length; i++) {
//            System.out.print(i + " ");
//            System.out.print(powers[i] + " ");
//            System.out.print(decimal + " ");
            if (decimal >= powers[i]) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
            decimal = decimal % powers[i];
        }
    }
}
