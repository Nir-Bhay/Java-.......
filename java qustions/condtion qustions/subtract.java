public class subtract {
    
    public int subtractProductAndSum(int n) {
        int prod = 1; // Initialize product to 1
        int sum = 0; // Initialize sum to 0

        // Loop to process each digit
        while (n > 0) {
            int tem = n % 10; // Get the last digit
            prod = prod * tem; // Multiply the digit to the product
            sum = sum + tem; // Add the digit to the sum
            n = n / 10; // Remove the last digit
        }

        int result = prod - sum; // Subtract sum from product
        return result; // Return the result
    }
}
