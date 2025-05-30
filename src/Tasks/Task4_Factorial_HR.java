package Tasks;

import java.util.Scanner;

public class Task4_Factorial_HR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            //System.out.println(n);
            long f = 1;
            if (n == 0) {
                f = 1;
            }
           for (int i = 1; i <= n; i++) {
               f = f * i;
            }
            System.out.println("Factorial is :"+f);
        }
        else {
            System.out.println("Enter the Integer No. only.");
        }
    }
}
