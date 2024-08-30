package usit;
import java.util.Scanner;

public class EvenOddArra { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row;
        int column;

        System.out.println("Enter the number of rows:");
        row = sc.nextInt();

        int[][] array = new int[row][];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1) + ":");
            column = sc.nextInt();
            array[i] = new int[column];

            System.out.println("Enter " + column + " values for row " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int evenCount = 0;
        int oddCount = 0;

        // Additional code to process and print the array can be added here
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Total number of even numbers is: " + evenCount);
        System.out.println("Total number of odd numbers is: " + oddCount);
        sc.close();
    }
}
