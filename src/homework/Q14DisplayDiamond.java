package homework;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *    While loop
 *
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */


public class Q14DisplayDiamond {


    public static void printDiamond(int rows) {
        // Top half of the diamond
        int i = 1;
        while (i <= rows) {
            // Print spaces
            int spaces = rows - i;
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println(); // Move to the next line
            i++;
        }

        // Bottom half of the diamond
        i = rows - 1;
        while (i >= 1) {
            // Print spaces
            int spaces = rows - i;
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println(); // Move to the next line
            i--;
        }
    }

    public static void main(String[] args) {
        int rows = 7; // Number of rows for the top half of the diamond
        printDiamond(rows); // Call the method to print the diamond pattern
    }
}

