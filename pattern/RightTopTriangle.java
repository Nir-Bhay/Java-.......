package pattern;

import java.util.Scanner;

public class RightTopTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for the pattern you want:");
        int r = sc.nextInt();
        char c[][] = new char[r][];

        // Initialize the 2D array with appropriate sizes
        for (int k = 0; k < r; k++) {
            c[k] = new char[r]; // Allocate space for r columns in each row
        }

        // Fill the array with the pattern
        for (int k = 0; k < r; k++) {
            // Fill with leading spaces first
            for (int j = 0; j < k; j++) {
                c[k][j] = ' ';
            }
            // Fill the rest with '*'
            for (int j = k; j < r; j++) {
                c[k][j] = '*';
            }
        }

        // Print the pattern
        for (int k = 0; k < r; k++) {
            for (int j = 0; j < r; j++) {
                System.out.print(c[k][j]);
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}
