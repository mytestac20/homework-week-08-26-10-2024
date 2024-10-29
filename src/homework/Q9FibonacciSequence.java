package homework;

/**
 * . Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Q9FibonacciSequence {
    public static void main(String[] args) {
        int n = 8; // Number of Fibonacci numbers to print
        int first = 1; // First Fibonacci number
        int second = 1; // Second Fibonacci number

        System.out.print(first + " " + second + " "); // Print the first two numbers

        // Loop to calculate and print the remaining Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next number

            // Update the first and second numbers for the next iteration
            first = second;
            second = next;
        }
    }
}
