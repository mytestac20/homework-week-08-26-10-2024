package homework;

import java.util.Scanner;
/*
1. Read 10 numbers from the console entered by the user and print the sum of those
numbers. -Use the hasNextInt() method from the scanner to check if the user has entered an int value. -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers. -Use the nextInt() method to get the number and add it to the sum. -Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc. -For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on.
Hint:  -Use a while loop. -Use a counter variable for counting valid numbers. -Close the scanner after you don't need it anymore. -Create a class with the name homework.ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge {


    public static void main(String[] args) {
        int sum = readNumbersAndCalculateSum(10);
        System.out.println("The sum of the entered numbers is: " + sum);
    }

    private static int readNumbersAndCalculateSum(int totalNumbers) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < totalNumbers) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            // Check if the next input is a valid integer
            if (scanner.hasNextInt()) { // Using hasNextInt() to check for valid integer input
                int number = scanner.nextInt(); // Using nextInt() to read the valid integer
                sum += number; // Add to the sum
                count++; // Increment the count of valid inputs
            } else {
                System.out.println("Invalid Number"); // Print message for invalid input
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
        return sum; // Return the total sum
    }
}
