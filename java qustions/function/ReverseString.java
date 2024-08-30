package function;
public class ReverseString {

    public static void main(String[] args) {
        String name = "Nirbhay ggg";
        int num = 12321;
        // String numvalu = (num);

        StringBuilder reversedName = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i); // Get the character at index i
            reversedName.append(ch); // Append it to the reversedName
        }

        System.out.println("Reversed name: " + reversedName.toString());
    }
}

