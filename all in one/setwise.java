import java.util.Arrays;

public class setwise {

    public static void main(String[] args) {

        int columns = 4;
        int rows = 7;
        int totalStudents = 88;
        // For every class
        int numberOfStudentData = 40;

        int[] arr = new int[numberOfStudentData];
        for (int i = 0; i < numberOfStudentData; i++) {
            arr[i] = i + 1;
        }

        int studentIndex = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (studentIndex < totalStudents) {
                    System.out.print(arr[studentIndex] + " ");
                    studentIndex++;
                } else {
                    
                    System.out.print("X "); // Placeholder for empty seats
                }
            }
            System.out.println();
        }

        // System.out.println(Arrays.toString(arr));
    }
}
