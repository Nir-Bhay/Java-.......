package function;
import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {
        // char name = 'o';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chater or a word...");
        char name = sc.next().charAt(0);

        char[] latter = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        boolean isvowle = false;

        for (int vowel : latter) {
            if (vowel == name) {
                isvowle = true;
            }
        }

        if (Character.isLetter(name)) {
            if (isvowle) {
                System.out.println("it is a vowle.....");
            } else {
                System.out.println("is constent...");
            }
        } else {
            System.out.println("it is invalent ...");
        }

    }
}