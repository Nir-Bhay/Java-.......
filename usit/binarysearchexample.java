package usit;

import java.util.Arrays;

public class binarysearchexample {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 22, 44, 55, 66, 77 };
        int target = 66;
        int ans = binarySearch(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    static int binarySearch(int[] arra, int target) {
        int first = 0;
        int last = arra.length - 1;
        
        while (first <= last) {
             
            int mid = first + (last - first) / 2;

            if (target > mid) {
                first = mid + 1;

            }
            else if (target < mid) {
                last = mid - 1;
            }
            else {
                return 1;
            }
            
         }

        
        return -1; // Target not found
    }
}
