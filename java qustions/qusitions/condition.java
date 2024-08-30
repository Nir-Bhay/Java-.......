package qusitions;
import java.util.Scanner;

public class condition {
    static final float PI = 3.104f;

    static float areaOfCircle(float radius) {
        return PI * radius * radius;
    }

    static float areaOfTriangle(float base, float height) {
        return 0.5f * base * height;
    }

    static float areaOfRectangle(float length, float width) {
        return length * width;
    }

    static float perimeterOfCircle(float radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "------------------------------------------------------------------------------------------------");
            System.out.println("Choose one of the following options:");
            System.out.println("1. Area Of Circle");
            System.out.println("2. Area Of Triangle");
            System.out.println("3. Area Of Rectangle");
            System.out.println("4. Area Of Isosceles Triangle");
            System.out.println("5. Area Of Parallelogram");
            System.out.println("6. Area Of Rhombus");
            System.out.println("7. Area Of Equilateral Triangle");
            System.out.println("8. Perimeter Of Circle");
            // Add the rest of your options here...
            System.out.println("=================================================================");

            System.out.println("Enter the number you want to calculate ....");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the radius of the circle:");
                    float radius = sc.nextFloat();
                    float areaCircle = areaOfCircle(radius);
                    System.out.println("The area of the circle is: " + areaCircle);
                    break;
                case 2:
                    System.out.println("Enter the base of the triangle:");
                    float base = sc.nextFloat();
                    System.out.println("Enter the height of the triangle:");
                    float height = sc.nextFloat();
                    float areaTriangle = areaOfTriangle(base, height);
                    System.out.println("The area of the triangle is: " + areaTriangle);
                    break;
                case 3:
                    System.out.println("Enter the length of the rectangle:");
                    float length = sc.nextFloat();
                    System.out.println("Enter the width of the rectangle:");
                    float width = sc.nextFloat();
                    float areaRectangle = areaOfRectangle(length, width);
                    System.out.println("The area of the rectangle is: " + areaRectangle);
                    break;
                case 8:
                    System.out.println("Enter the radius of the circle:");
                    float radiusPerimeter = sc.nextFloat();
                    float perimeterCircle = perimeterOfCircle(radiusPerimeter);
                    System.out.println("The perimeter of the circle is: " + perimeterCircle);
                    break;
                // Add cases for other options here with appropriate formulas
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println("..............................................................");
        }

        // sc.close();
    }
}
