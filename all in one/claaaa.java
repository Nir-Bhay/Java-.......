// Class definition for Student
class Student {
    // Attributes
    String name;
    int age;
    String course;

    // Constructor
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

// Class definition for Course
class Course {
    // Attribute
    String courseName;

    // Constructor
    Course(String name) {
        courseName = name;
    }
}

// Main class
public class claaaa {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student("John", 20, "Computer Science");
        Student student2 = new Student("Alice", 22, "Mathematics");

        // Creating an object of Course class
        Course javaCourse = new Course("Java Programming");

        // Displaying information using methods
        student1.displayInfo();
        student2.displayInfo();

        // Accessing and displaying course name
        System.out.println("Course Name: " + javaCourse.courseName);
    }
}
