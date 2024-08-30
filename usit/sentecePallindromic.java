package usit;
public class sentecePallindromic {
    public static void main(String[] args) {
        String str = "123456654334321";

        String word = str.replaceAll("\\s+", "").toLowerCase();
        System.out.println(str);
        System.out.println(word);
        System.out.println(isPalindrome(word));

    }

    private static boolean isPalindrome(String str) {
        int first = 0;
        int last = str.length() - 1;
        while (first <= last) {
            if (str.charAt(first) == str.charAt(last)) {
                first++;
                last--;
            } else {
                return false;
            }

        }
        return true;
    }

}
