package Tasks;

import java.util.Scanner;

public class Task3_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Month Number: ");
        int month_num = scanner.nextInt();

        switch (month_num) {
            case 1,3,5,7,8,10,12: {
                System.out.println("31 days");
                break;
            }
            case 4,6,9,11: {
                System.out.println("30 days");
                break;
            }
            case 2: {
                System.out.print("Enter the Year: ");
                int input_year = scanner.nextInt();
                if ((input_year%4 == 0 && input_year% 100 != 0) || input_year%400 == 0){
                    System.out.println("It's a Leap Year, so 29 days");
                }
                else {
                    System.out.println("It's a Non-Leap Year, so 28 days");
                }
                break;
            }
            default: {
                System.out.println("Invalid Month Input");
            }
        }
    }
}
