
import java.util.Scanner;

public class factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number and print all the factors of that number (use loops).
        while (true) {

            System.out.println("Enter the numbr ..");
            int n = sc.nextInt();
            int i = 1;
            int count = 0;
            while (i <= n) {

                if (n % i == 0) {
                    System.out.println(i);
                    count++;

                }
                i++;
            }
            System.out.println("Total numebr of factro is .... " +count);
            sc.close();
        }
        
    }
}

