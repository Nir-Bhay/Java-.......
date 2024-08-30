import java.util.Scanner;

public class SumOfNumbersCalculator {

    public static int sumOfNNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = sumOfNNumbers(n);
        System.out.println("Sum of first " + n + " numbers: " + sum);

        scanner.close();
    }
}
