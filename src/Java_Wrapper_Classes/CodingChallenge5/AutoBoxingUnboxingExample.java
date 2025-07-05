package Java_Wrapper_Classes.CodingChallenge5;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        int value = 10; // Primitive int

        // Autoboxing: converting int to Integer
        Integer boxedValue = value;
        System.out.println("Autoboxed: " + boxedValue);

        // Unboxing: converting Integer to int
        int unboxedValue = boxedValue;
        System.out.println("Unboxed: " + unboxedValue);
    }
}
