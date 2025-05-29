package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7: ");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thrusday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
//                default:
//                    System.out.println("Enter integer from 1 tp 7 only, you foll!");
            }
        } else {
            System.out.println("You entered a invalid integer number");
        }
    }
}
