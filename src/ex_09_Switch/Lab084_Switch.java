package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

//        Data Types: The expression in a switch statement can be of the following data types:
//        Primitive types: byte, short, char, int.
//        Enums.
//        String (since Java 7).
//        Wrapper types of the primitive types.

        // Take a user input and aks for the interger from 1 to 7
        // And if user enters 1 to 7
        // you will tell which dsay it is

        // Login Building Formula
        //Step-1 : Reading the number from the Scanner class
        //Step-2 : basic figuring out the expression and the day
        //Step-3 : Basically add the step 3 as a rough logic

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7: ");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter integer from 1 tp 7 only, you foll!");
            }
        } else {
            System.out.println("You entered a invalid integer number");
        }

    }
}
