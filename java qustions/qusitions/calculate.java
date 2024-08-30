
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = input.nextInt();
            System.out.println("Wnter secont number ...");
            int b = input.nextInt();
            System.out.println("enter you operate you want + , -, %,/,* and for quit 'q'...");
            char c = input.next().charAt(0);
            if (c == 'q') {
                System.out.println("Thank you for using this program");
            }

            switch (c) {
                case '+':
                    System.out.println("the result is: " + (a + b));
                    break;

                case '-':
                    System.out.println("the result is: " + (a - b));
                    break;

                case '/':
                    System.out.println("the result is: " + (a / b));
                    break;

                case '%':
                    System.out.println("the result is: " + (a % b));
                    break;

                case '*':
                    System.out.println("the result is: " + (a * b));
                    break;

            }
        }

    }
}
