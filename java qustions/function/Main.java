package function;
import java.util.Scanner;

public class Main {

    // Method to find the maximum number among three numbers
    public static void findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("The greatest number is: " + a);
        } else if (b >= c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
    }

    // Method to find the minimum number among three numbers
    public static void findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("The smallest number is: " + a);
        } else if (b <= c) {
            System.out.println("The smallest number is: " + b);
        } else {
            System.out.println("The smallest number is: " + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calling the methods to print the maximum and minimum numbers
        findMax(a, b, c);
        findMin(a, b, c);

        sc.close();
    }
}
