package function;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Terminate the loop if the user enters 0
            } else if (num < 0) {
                sumNegative += num; // Add to sum of negative numbers
            } else if (num % 2 == 0) {
                sumPositiveEven += num; // Add to sum of positive even numbers
            } else {
                sumPositiveOdd += num; // Add to sum of positive odd numbers
            }
        }

        scanner.close();

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
