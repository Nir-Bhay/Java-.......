import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22};
        int n = arr.length;
        Selectionsort(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    static void Selectionsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }

            }

        }
    }

    static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}
