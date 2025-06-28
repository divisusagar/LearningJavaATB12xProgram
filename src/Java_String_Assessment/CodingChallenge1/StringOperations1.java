package Java_String_Assessment.CodingChallenge1;

public class StringOperations1 {
    public static void main(String[] args) {

        System.out.println("\n--- Coding Challenge 2: String Comparison and Equality ---");

        // 1. Initial String Declaration
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        // 2. String Concatenation using '+' operator
        String concatenatedString = originalString + " World";
        System.out.println("Concatenated String: " + concatenatedString);

        // 3. Getting String Length
        int length = concatenatedString.length();
        System.out.println("Length of concatenated string: " + length);

        // 4. Character Extraction (First character)
        // charAt(index) returns the character at the specified index.
        // String indices are 0-based.
        char firstChar = concatenatedString.charAt(0);
        System.out.println("First character: " + firstChar);

        // 5. Substring Extraction
        // substring(beginIndex) returns a new string that is a substring of this string.
        // The substring begins at the specified beginIndex and extends to the end of this string.
        String subStringToEnd = concatenatedString.substring(6); // "World" starts at index 6
        System.out.println("Substring from index 6 to end: " + subStringToEnd);

        // substring(beginIndex, endIndex) returns a new string that is a substring of this string.
        // The substring begins at the specified beginIndex and extends to the character at endIndex - 1.
        String subStringPartial = concatenatedString.substring(0, 5); // "Hello" is from index 0 to 4
        System.out.println("Substring from index 0 to 4: " + subStringPartial);

        System.out.println("\n--- Example using given Input/Output ---");
        String inputString = "Hello World";
        System.out.println("Input String: " + inputString);
        // Adjusted substring to get "Wor" (from index 6 up to but not including index 9)
        System.out.println("Length: " + inputString.length() +
                ", First char: " + inputString.charAt(0) +
                ", Substring: " + inputString.substring(6));
    }
}
