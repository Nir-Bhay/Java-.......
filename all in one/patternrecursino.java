public class patternrecursino {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 5, 2, 1 };
        int n =arr.length; // Define the size of the pattern
        
        printTrianglePattern(arr,n, 0);
    }

    // static void printTrianglePattern(int row, int column) {
    //     if (row == 0) {
    //         return;
    //     }
    //     if (column < row) {
    //         printTrianglePattern(row, column + 1);
    //         System.out.print("*");
    //     } else {
    //         printTrianglePattern(row - 1, 0);
    //         System.out.println();
    //     }
    // }

    static void printTrianglePattern(int [] arr , int row, int column) {
        if (arr[row] == 0) {
            return;
        }
        if (column < row) {
            printTrianglePattern(row, column + 1);
            System.out.print("*");
        } else {
            printTrianglePattern(row - 1, 0);
            System.out.println();
        }
    }
}

