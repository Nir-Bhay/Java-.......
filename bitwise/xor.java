public class xor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 4, 5, 5, 6, 7, 7 };
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) { // Corrected the parameter to int[] arr
        int uniq = 0;
        for (int num : arr) { // Enhanced for loop to iterate over the array
            uniq ^= num; // XOR operation to find the unique element
        }
        return uniq; // Returns the unique element
    }
    
}
