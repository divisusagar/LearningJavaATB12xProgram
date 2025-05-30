package Tasks;

import java.util.Scanner;

public class Task3_Marks_Grade_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Marks -> ");
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            if (marks >=0 && marks <= 100) {
                // Logic-Approach-1
//                if (marks >= 90) {
//                    System.out.println("Scored Grade A");
//                } else if (marks >= 80) {
//                    System.out.println("Scored Grade B");
//                } else if (marks >= 70) {
//                    System.out.println("Scored Grade C");
//                } else if (marks >= 60) {
//                    System.out.println("Scored Grade D");
//                } else {
//                    System.out.println("Scored Grade F");
//                }

                // Logic-Approach-2
                  String result = (marks >=90) ? "Grade A" : (marks >=80) ? "Grade B" : (marks >= 70) ? "Grade C" : (marks >=60) ? "Grade D" : "Grade F";
                  System.out.println(result);

            } else {
                System.out.println("Marks should be within the range 0 - 100 only");
                System.exit(0);
            }

        } else {
            System.out.println("Provide the Numerical value within the range 0 - 100 only.");
            System.exit(0);
        }



    }

}
