public class Stringa {
    public static void main(String[] args) {
        // Creating a String
        String str = "Hello , World!";

        // Method 1: length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Method 2: charAt(index)
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Method 3: substring(startIndex, endIndex)
        String substring = str.substring(0, 5);
        System.out.println("Substring from index 0 to 4: " + substring);

        // Method 4: indexOf(character)
        int indexOfChar = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOfChar);
    }
}
