/*
 * Fizz Buzz
 * 
 * This program is a Fizz Buzz example in Java.
 * The user will enter a number and the program will
 * FizzBuzz up until that number.
 * 
 * If a number is divisible by 3, print out Fizz
 * If a number is divisible by 5, print out Buzz,
 * If a number is dividible by 3 and 5, print out Fizz Buzz
 * 
 * Else, simply print out the number. Continue this
 * routine until the user's input number is reached
 * 
 * @author Thomas Lynaugh
 * 
 * Last Modified: February 20, 2019
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Prompt and fetch user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int input = scan.nextInt();

		System.out.println();

		fizzBuzz(input);
	}

	/*
	 * Perform FizzBuzz until the user's input number
	 * 
	 * @param input - The user's input up to which FizzBuzz will be performed
	 */
	private static void fizzBuzz(int input) {
		for (int i = 1; i < input; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}

	}

}
