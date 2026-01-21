
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A (Excellent!)");
        } else if (marks >= 80) {
            System.out.println("Grade: B (Very Good)");
        } else if (marks >= 70) {
            System.out.println("Grade: C (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: D (Satisfactory)");
        } else if (marks >= 50) {
            System.out.println("Grade: E (Pass)");
        } else if (marks >= 40) {
            System.out.println("Grade: F (Barely Pass)");
        } else {
            System.out.println("Grade: Fail (Needs Improvement)");
        }

        scanner.close();
    }
}