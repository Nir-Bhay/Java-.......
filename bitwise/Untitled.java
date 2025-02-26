public class Untitled {

    // Bubble Sort Method
    public static void bubblesort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap elements if they're in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 2, 1 }; // Input array
        int n = arr.length;

        // Call the bubble sort method
        bubblesort(arr, n);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
