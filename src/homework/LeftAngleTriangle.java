package homework;

/**
 * 15. Display left angle triangle of * using nested for loops
 *          *
 *         * *
 *                    * * *
 *                   * * * *
 *      * * * * *
 */

public class LeftAngleTriangle {

    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle
        printTriangle(rows); // Call the method to print the triangle
    }
}
