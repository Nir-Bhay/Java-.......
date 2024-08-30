package usit;
import java.util.Arrays;

public class binary {
    public static void main(String[] args) {

        int[] arry = { 11, 23, 44, 35, 22, 39, 85, 45 };
        Arrays.sort(arry);

        int x = 44;

        int result = Arrays.binarySearch(arry, x);
        System.out.println(result);
        
        for (int i = 0; i <= arry.length; i++) {
            if (arry[i] == x) {
                System.out.println("Element found at index " + i);
            } else {
                System.out.println(arry[i]);
            }

            //
            int first = 0;
            int last = arry.length - 1;

            while (first <= last) {
                int mid = (first + last) / 2;
                if (arry[mid] < x) {
                    first = mid + 1;
                } else if (arry[mid] > x) {
                    last = mid - 1;

                } else {
                    System.out.println("Element found at index " + mid);
                    break;
                }
            }
        }
    }
}