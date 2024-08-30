package usit;
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] addToArrayForm(int[] num, int k) {
        // Convert array of digits to a string
        StringBuilder numStr = new StringBuilder();
        for (int digit : num) {
            numStr.append(digit);
        }

        // Convert the string to an integer
        int number = Integer.parseInt(numStr.toString());

        // Add k to the integer
        int sum = number + k;

        // Convert the sum back to a string
        String sumStr = Integer.toString(sum);

        // Convert the string back to an array of digits
        int[] result = new int[sumStr.length()];
        for (int i = 0; i < sumStr.length(); i++) {
            result[i] = Character.getNumericValue(sumStr.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        int k = 23;
        int[] result = addToArrayForm(num, k);

        // Print the result
        System.out.println(Arrays.toString(result)); // Output: [1, 4, 6]
    }
}
