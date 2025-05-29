package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to use to
        // I will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser: ");
        String browser = scanner.next().toLowerCase();

        switch (browser) {
//            default:
//                System.out.println("I have no idea which browser is this");
//                break;
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the Firefox");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Starting the Edge");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
        System.out.println("End of the Program");
    }
}
