package homework;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered. -Before the user enters the number, print the message Enter number:  -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:  -Use an endless while loop.  -Create a class with the name homework.MinAndMaxInputChallenge.
 */



public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // Initialize min to the highest possible value
        int max = Integer.MIN_VALUE; // Initialize max to the lowest possible value

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt(); // Read the valid integer

                // Update min and max
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid Number"); // Print message for invalid input
                break; // Exit the loop on invalid input
            }
        }

        // Check if any numbers were entered
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        scanner.close(); // Close the scanner to free resources
    }
}

