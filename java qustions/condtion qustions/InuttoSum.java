
import java.util.Scanner;

public class InuttoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            sum = sum + num;
            // System.out.println(sum);
            if (num == 0) {
                System.out.println("sum is " + sum);
                break;
            }

        }
        sc.close();
    }
}
