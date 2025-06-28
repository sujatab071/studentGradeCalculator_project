import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Total subjects
        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
        int total = 0;
        double average;
        char grade;

        // Obtained marks
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Valid marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--; // Repeat the current subject input
                continue;
            }

            total += marks[i];
        }

        // Calculate average marks
        average = (double) total / numberOfSubjects;

        // Calculate grade
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + average );
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}
