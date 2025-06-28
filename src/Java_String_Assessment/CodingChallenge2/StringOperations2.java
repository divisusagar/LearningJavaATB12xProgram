package Java_String_Assessment.CodingChallenge2;

public class StringOperations2 {
    public static void main(String[] args) {

        System.out.println("\n--- Coding Challenge 2: String Comparison and Equality ---");

        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        System.out.println("string1: \"" + string1 + "\", string2: \"" + string2 + "\", string3: \"" + string3 + "\"");
        System.out.println();

        // Using == operator: Checks if two object references are equal (point to the same memory location)
        System.out.println(" string1 == string2: " + (string1 == string2)); // false (different objects, different content)
        System.out.println(" string1 == string3: " + (string1 == string3)); // true (both refer to the same literal in pool)
        System.out.println(" string2 == string3: " + (string2 == string3)); // false (different objects, different content)
        System.out.println();

        // Using equals() method: Compares the actual content of the strings (case-sensitive)
        boolean equalsResult = string1.equals(string2);
        System.out.println("string1.equals(string2): " + equalsResult); // false

        // Using equalsIgnoreCase() method: Compares the actual content of the strings (case-insensitive)
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);
        System.out.println("string1.equalsIgnoreCase(string2): " + equalsIgnoreCaseResult); // true

        // Using compareTo() method: Compares strings lexicographically
        // Returns 0 if strings are equal
        // Returns a negative integer if the calling string is lexicographically less than the argument string
        // Returns a positive integer if the calling string is lexicographically greater than the argument string
        // The difference in ASCII/Unicode values of the first differing character is often returned.
        int compareToResult = string1.compareTo(string2); // 'H' (72) - 'h' (104) = -32
        System.out.println("string1.compareTo(string2): " + compareToResult); // Should output -32

        System.out.println();

        // Output matching the example:
        System.out.println("equals(): " + equalsResult +
                ", equalsIgnoreCase(): " + equalsIgnoreCaseResult +
                ", compareTo(): " + compareToResult);
    }
}
