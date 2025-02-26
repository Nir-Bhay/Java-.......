public class index {
    String name = "nirbhay"; 
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " = " + sum);
    }

    static int sumOfDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive step
        int value = n % 10 + sumOfDigits(n / 10);
        System.out.println(n % 10 + " " + sumOfDigits(n / 10) );
        // System.out.println(value);
        // System.out.println(value);
        return value;
    }
}
