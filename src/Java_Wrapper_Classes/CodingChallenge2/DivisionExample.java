package Java_Wrapper_Classes.CodingChallenge2;

public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;  // Example input
        int denominator = 2; // Change the denominator 2 or 0 to test usecases

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

}
