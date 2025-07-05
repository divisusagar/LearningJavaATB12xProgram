package Java_Wrapper_Classes.CodingChallenge8;

public class GenericPrint {
    // Generic method to print any array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // For new line
    }

    public static void main(String[] args) {
        // Example 1: String array
        String[] strArray = {"A", "B", "C"};
        printArray(strArray);  // Output: A B C

        // Example 2: Integer array
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);  // Output: 1 2 3
    }
}
