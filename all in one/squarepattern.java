import java.util.*;


public class squarepattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
  System.out.println(" Make a star pattern ::");
        // System.out.println("Make squate pattern give me the length of Square or rectngle ");
        System.out.println("Enter length of rectangle : ");
        int length = sc.nextInt();
        System.out.println("enter height of rectangle :");
        int height = sc.nextInt();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
