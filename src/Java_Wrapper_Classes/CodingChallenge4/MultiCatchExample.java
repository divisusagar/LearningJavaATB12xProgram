package Java_Wrapper_Classes.CodingChallenge4;

public class MultiCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 5};
        int index = 1;       // Valid index to trigger ArithmeticException & Invalid index to trigger ArrayIndexOutOfBoundsException
        int divisor = 0;     // 0 to trigger ArithmeticException

        try {
            int result = numbers[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
