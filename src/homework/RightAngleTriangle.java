package homework;

/**
 * Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing '@' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print '@' without a newline
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
