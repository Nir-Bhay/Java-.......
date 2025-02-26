import java.util.*;



public class again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of names :");
        number = sc.nextInt();

       int name[] = new int[number];

       for (int i = 0; i < number; i++,number--) {
           System.out.println("Enter the " + number + " of names ::");
           name[i] = sc.nextInt();

       }
        
        System.out.println("hello ");
    }
}