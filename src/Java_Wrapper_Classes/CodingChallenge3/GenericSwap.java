package Java_Wrapper_Classes.CodingChallenge3;

import java.util.Arrays;

public class GenericSwap {
    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length) {
            System.out.println("Error: Invalid indices");
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] intArray = {1, 2, 3};
        swap(intArray, 0, 2);
        System.out.println(Arrays.toString(intArray));  // Output: [3, 2, 1]

        // Example 2: String array
        String[] strArray = {"A", "B", "C"};
        swap(strArray, 0, 1);
        System.out.println(Arrays.toString(strArray));  // Output: [B, A, C]
    }
}
