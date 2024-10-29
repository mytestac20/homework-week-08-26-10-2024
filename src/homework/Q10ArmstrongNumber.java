package homework;

import java.util.Scanner;

/**
 * . Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Q10ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close(); // Close the scanner to free resources
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        // Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise to the power of digits and add to sum
            number /= 10; // Remove the last digit
        }

        // Compare the sum to the original number
        return sum == originalNumber;
    }

}
