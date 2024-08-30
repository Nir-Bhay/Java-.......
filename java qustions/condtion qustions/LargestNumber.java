import java.util.Scanner;

public class LargestNumber {
    // Take integer inputs till the user enters 0 and print the largest number from
    // all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int larg = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Largest number is: " + larg);
                break;
            }

            if (num > larg) {
                larg = num;
            }
        }
        sc.close();
    }
}
