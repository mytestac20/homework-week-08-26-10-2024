package homework;

import java.util.Scanner;

/**
 *  Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine(); // Read user input

        // Check for valid input
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single letter (a-z or A-Z).");
        } else {
            char letter = input.charAt(0); // Get the single character input
            // Check if the letter is a vowel or consonant
            if (isVowel(letter)) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        scanner.close(); // Close the scanner to free resources
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char letter) {
        return "AEIOUaeiou".indexOf(letter) != -1; // Check for vowels
    }
}

