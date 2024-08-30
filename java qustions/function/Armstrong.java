package function;
public class Armstrong {

    public static void main(String[] args) {
        int n = 1503;
        int originalNumber = n;
        int numDigits = 0;
        int temp = n;

        // Calculate the number of digits in the given number
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }

        temp = n;
        int armstrong = 0;

        // Calculate the sum of cubes of digits
        while (temp > 0) {
            int digit = temp % 10;
            armstrong += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if it is an Armstrong number
        if (armstrong == originalNumber) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}
