package usit;
// import java.util.*;
import java.util.Scanner;


public class javaquist {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
      
        String[] split = sentence.split(" ");
        for (int i = 0; i <= split.length - 1; i++) {
            String capatial = split[i].substring(0, 1).toUpperCase() + split[i].substring(1).toLowerCase();
            System.out.println(capatial);
        }
         
    }
}
