package function;
public class OddEven {

    // Method to determine if a number is odd or even and print the result
    public static void oddEven(int i) {
        if (i % 2 == 0) {
            
            System.out.println(i + " is an even number");
        } else {
            System.out.println(i + " is an odd number");
        }
    }

    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i <= n; i++) {
            oddEven(i);
        }
    }
}
