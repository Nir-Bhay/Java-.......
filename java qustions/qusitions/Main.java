package qusitions;
public class Main {
    
    
    public static void Check (int name ,int number) { 
        if (number / name >= 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is less than 5");
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        // int name = 2;
        // int number = 10; // Integer
        // double pi = 3.14; // Double
        // char letter = 'A'; // Character
        // String message = "Hello"; // String
        // boolean isJavaFun = true; // Boolean

        // Check(name,number);
        Check(24, 355);
        
       
    }
}