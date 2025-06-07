package Tasks;

import java.util.Scanner;

public class Task_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:");
        String inputStr = scanner.next();
        String reverseStr = "";
        for (int i = inputStr.length()-1; i>=0; i--) {
            reverseStr = reverseStr + inputStr.charAt(i);
        }
        if (inputStr.equalsIgnoreCase(reverseStr)) {
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Its Not a Palindrome");
        }

    }
}
