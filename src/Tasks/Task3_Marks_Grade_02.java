package Tasks;

import java.util.Scanner;

public class Task3_Marks_Grade_02 {
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "Grade A";
        } else if (marks >= 80) {
            return "Grade B";
        } else if (marks >= 70) {
            return "Grade C";
        } else if (marks >= 60) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Marks -> ");

        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            if (marks > 0 && marks <= 100) {
                String grade = calculateGrade(marks);
                System.out.println(grade);
            } else {
                System.out.println("Marks should be within the range 0 - 100 only.");
            }
        } else {
            System.out.println("Provide a numerical value within the range 0 - 100 only.");
        }
    }
}
