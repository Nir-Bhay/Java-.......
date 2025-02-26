import java.util.*;


public class array {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        again again = new again();
        // again.name[6];

        int size =0 ;
        System.out.println("Enter size of array");
        size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++ , --size ) {
            System.out.println("enter the " + size + " number's ");
            number[i] = sc.nextInt();

        }

        for (int i = 0; i <= number.length; i++) {
            System.out.println(number[i]);
        }



    }
}
