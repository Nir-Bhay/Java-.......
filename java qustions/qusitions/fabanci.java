package qusitions;
import java.util.Scanner;

public class fabanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 1 1 2 3 5 8
        System.out.println("enter the num...");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int coutn = 2;
        while (coutn <= n) {

            int temp = b;
            b = a + b;
            a = temp;
            if (coutn == n) {
                System.out.println(b);
            }
            coutn++;
        }
        
      

    }
}
