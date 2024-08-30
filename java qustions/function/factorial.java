package function;
import java.util.Scanner;

public class factorial {

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // Calculate and print the factorial
        int ans = factorial(n);
        System.out.println("Factorial of " + n + " is: " + ans);

        sc.close();
    }
}
