import java.util.Arrays;

public class cyshort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 7, 6 };
        cycleshort(arr);
        System.out.println(Arrays.toString(arr)); // Print the sorted array

    }

    static void cycleshort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Find the correct position for arr[i] (assuming values are 1 to n)
            int correct = arr[i] - 1; // Subtract 1 because array is 0-indexed
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct); // Swap if the element is not in the correct position
            } else {
                i++; // Move to the next element
            }
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
