package Java_Wrapper_Classes.CodingChallenge10;

public class BoundedGenericSum {
    // Generic method with bounded type
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (T element : array) {
            total += element.doubleValue(); // Convert each number to double
        }
        return total;
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] intArray = {1, 2, 3};
        System.out.println("Sum: " + sum(intArray));  // Output: Sum: 6.0

        // Example 2: Double array
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum: " + sum(doubleArray));  // Output: Sum: 7.5
    }
}
