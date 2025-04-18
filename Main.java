import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📚 Student Grade Management System 📚");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Display Topper");
            System.out.println("4. Search Student by Name or ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    manager.displayTopper();
                    break;
                case 4:
                    manager.searchStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
