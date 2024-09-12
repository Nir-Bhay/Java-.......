package pattern.nirbhay;

public class patter9 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int j = i - 1; j < n; j++) {
                System.out.print("*");
            }

            // for (int j = 1; j < i; j++) {
            //     System.out.print("*");
            // }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = i-1; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
