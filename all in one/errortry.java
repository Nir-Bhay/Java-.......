public class errortry {
    // public class TryCatchExample {
        public static void main(String[] args) {
            try {
                // Code that may throw an exception
                int result = 10 / 0; // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handling the exception
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

// }
