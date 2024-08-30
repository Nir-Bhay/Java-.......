package qusitions;
import java.util.Scanner;

public class repetcout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// it want ot acalaculate the repelt eh numer in the 343232423
        // liek how many time eh 3 come in it ...
        // so we will use the string method to do it
        while (true) {

            System.out.println("ente you comple value ....");
            int n = sc.nextInt();
            System.out.println("you want to check ....");
            int repeteValue = sc.nextInt();
            int count = 0;
            while (n != 0) {

                int value = n % 10;
                if (value == repeteValue) {
                    count++;
                }
                n = n / 10;
            }
            System.out.println("the repete value is " + count);
        }
    }

}
