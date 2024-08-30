import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple Fibonacci calculations
        while (true) {
            int a = 0;
            int b = 1;
            int count = 2;

            System.out.println("Enter the number of terms for Fibonacci sequence:");
            int n = sc.nextInt();

            // Create an array to store the Fibonacci numbers
            int[] fibonacciSeries = new int[n];

            // Initialize the first two terms
            fibonacciSeries[0] = a;
            if (n > 1) {
                fibonacciSeries[1] = b;
            }

            // Generate the Fibonacci sequence
            while (count < n) {
                int temp = a;
                a = b;
                b = temp + b;

                // Store the value in the array
                fibonacciSeries[count] = b;
                count++;
            }

            // Print all the values in the Fibonacci series
            System.out.print("All the values of Fibonacci sequence: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciSeries[i] + " ");
            }
            System.out.println();

            // Print the last Fibonacci number
            System.out.println("The " + n + "th Fibonacci number is " + fibonacciSeries[n - 1]);

            // Prompt user to continue or exit
            System.out.println("Do you want to calculate another Fibonacci sequence? (yes/no)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close(); // Close the scanner
    }
}
