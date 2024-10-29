package homework;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Q13SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if both numbers are within the range of 10 to 99
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        // Extract digits from num1
        int digit1A = num1 % 10; // Last digit
        int digit1B = num1 / 10; // First digit

        // Extract digits from num2
        int digit2A = num2 % 10; // Last digit
        int digit2B = num2 / 10; // First digit

        // Check for shared digits
        return (digit1A == digit2A || digit1A == digit2B || digit1B == digit2A || digit1B == digit2B);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // should return true
        System.out.println(hasSharedDigit(9, 99));  // should return false
        System.out.println(hasSharedDigit(15, 55)); // should return true
        System.out.println(hasSharedDigit(34, 43)); // should return true
        System.out.println(hasSharedDigit(22, 99)); // should return true
        System.out.println(hasSharedDigit(10, 25)); // should return false
    }
}