import java.util.List;

public class Student {
    private static int idCounter = 1;

    private int id;
    private String name;
    private List<Integer> marks;
    private double percentage;
    private String grade;

    public Student(String name, List<Integer> marks) {
        this.id = idCounter++;
        this.name = name;
        this.marks = marks;
        calculatePercentage();
        calculateGrade();
    }

    private void calculatePercentage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        this.percentage = (double) total / marks.size();
    }

    private void calculateGrade() {
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";
    }

    public void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.printf("Percent : %.2f\n", percentage);
        System.out.println("Grade   : " + grade);
        System.out.println("------------------------");
    }

    public double getPercentage() {
        return percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
