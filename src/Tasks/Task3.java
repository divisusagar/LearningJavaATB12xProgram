package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Grade of the Kid (A/B/C/F) : ");
        String grade = scanner.next().toUpperCase();

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
