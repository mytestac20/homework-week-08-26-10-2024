package homework;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint:
 * Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name homework.HomeworkDigitSumChallenge.
 */


public class HomeworkDigitSumChallenge {
    public static void main(String[] args) {
        // Test cases for the sumDigits method
        System.out.println(sumDigits(125));   // Expected output: 8 (1 + 2 + 5)
        System.out.println(sumDigits(1));     // Expected output: -1 (invalid)
        System.out.println(sumDigits(-10));   // Expected output: -1 (invalid)
        System.out.println(sumDigits(10));    // Expected output: 1 (1 + 0)
        System.out.println(sumDigits(999));    // Expected output: 27 (9 + 9 + 9)
        System.out.println(sumDigits(1234));   // Expected output: 10 (1 + 2 + 3 + 4)
    }

    // Method to calculate the sum of digits
    public static int sumDigits(int number) {
        // Check for invalid values
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        // Process the number to extract and sum its digits
        while (number > 0) {
            sum += number % 10;  // Add the least significant digit to sum
            number /= 10;        // Discard the least significant digit
        }

        return sum; // Return the total sum of digits
    }
}
