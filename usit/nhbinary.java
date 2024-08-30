package usit;

import java.util.Arrays;

public class nhbinary {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 22, 44, 55, 66, 77 };
        int target = 66;
        int ans = binarySearch(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    static int binarySearch(int[] arra, int target) {
        int start = 0;
        int end = arra.length - 1;

        while (start <= end) { // Changed < to <=
            int mid = start + (end - start) / 2;
            if (target < arra[mid]) {
                end = mid - 1;
            } else if (target > arra[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}
