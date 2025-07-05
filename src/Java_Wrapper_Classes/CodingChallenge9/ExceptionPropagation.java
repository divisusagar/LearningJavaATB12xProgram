package Java_Wrapper_Classes.CodingChallenge9;

public class ExceptionPropagation {
    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        // This will throw ArithmeticException
        int result = 10 / 0;
        System.out.println("Result: " + result); // Won’t execute
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");
        }
    }
}
