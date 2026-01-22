class StudentDetail {
    // Fields (instance variables)
    int rollNumber;
    String name;
    double marks;

    // Method to assign values
    void setDetails(int r, String n, double m) {
        rollNumber = r;
        name = n;
        marks = m;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Student {
    public static void main(String[] args) {

        // Object creation
        StudentDetail s1 = new StudentDetail();
        StudentDetail s2 = new StudentDetail();

        // Method calling
        s1.setDetails(1, "A", 88.5);
        s1.displayDetails();

        // Method calling
        s2.setDetails(2, "B", 89);
        s2.displayDetails();
    }
}
