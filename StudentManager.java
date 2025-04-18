import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        List<Integer> marks = new ArrayList<>();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks.add(scanner.nextInt());
        }
        scanner.nextLine(); // Clear the buffer

        Student student = new Student(name, marks);
        students.add(student);
        System.out.println("Student added successfully!");
        student.displayReport();
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.displayReport();
        }
    }

    public void displayTopper() {
        if (students.isEmpty()) {
            System.out.println("No students to evaluate.");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.getPercentage() > topper.getPercentage()) {
                topper = s;
            }
        }
        System.out.println("\n🏆 Topper:");
        topper.displayReport();
    }

    public void searchStudent() {
        System.out.print("Enter student name or ID to search: ");
        String input = scanner.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(input) || 
                String.valueOf(s.getId()).equals(input)) {
                s.displayReport();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
