package qusitions;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        while (true) {
            System.out.println("enter the charter ...");
            char aa = i.next().trim().charAt(0);
            if (aa >= 'a' && aa <= 'z') {
                System.out.println("the charter is small");
            } else if (Character.isDigit(aa)) {
                System.out.println("barak the look");
                break;
            } else {
                System.out.println("in large ...");
            }

        }

        // System.out.println("Enter the three numbers: ");
        // int a = i.nextInt();
        // int b = i.nextInt();
        // int c = i.nextInt();
        // if (a > b && a > c) {
        // System.out.println(a);
        // } else if (b > a && b > c) {
        // System.out.println(b);
        // } else {
        // System.out.println(c);
        // }
        // i watn to make a largest number of the itn the the

    }
}
