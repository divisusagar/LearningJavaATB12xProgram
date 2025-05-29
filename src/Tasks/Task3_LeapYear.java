package Tasks;

import java.util.Scanner;

public class Task3_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Year: ");
        if (scanner.hasNextInt()){
            int input_year = scanner.nextInt();
            System.out.println("Year "+input_year);

            if ((input_year%4 == 0 && input_year% 100 != 0) || input_year%400 == 0){
                System.out.println(input_year+" year is a Leap Year");
            }
            else {
                System.out.println(input_year+" year is a Non-Leap Year");
            }
        }
        else {
            System.out.println("Invalid Year Input Provide. Please Re-run the Program");
        }


    }
}
