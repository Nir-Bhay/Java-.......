
import java.util.StringTokenizer;

public class tokens {
    public static void main(String[] args) {
        String sentence = "Java Programming is fun";
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
