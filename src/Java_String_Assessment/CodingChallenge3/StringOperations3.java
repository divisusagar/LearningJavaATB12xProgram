package Java_String_Assessment.CodingChallenge3;

public class StringOperations3 {
    public static void main(String[] args) {
        System.out.println("\n--- Coding Challenge 3: StringBuilder vs StringBuffer Performance ---");

        int iterations = 10000; // Increased iterations for more noticeable differences

        // Performance Test for String Concatenation using '+'
        long startTime = System.nanoTime();
        String testString = "";
        for (int i = 0; i < iterations; i++) {
            testString += "a";
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("String concatenation (" + iterations + " iterations): " + stringTime + "ms");

        // Performance Test for StringBuilder
        startTime = System.nanoTime();
        StringBuilder testStringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            testStringBuilder.append("a");
        }
        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("StringBuilder append (" + iterations + " iterations): " + stringBuilderTime + "ms");


        // Performance Test for StringBuffer
        startTime = System.nanoTime();
        StringBuffer testStringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            testStringBuffer.append("a");
        }
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
        System.out.println("StringBuffer append (" + iterations + " iterations): " + stringBufferTime + "ms");

        // Output matching the example format (actual values will vary based on system performance)
        System.out.println("\nOutput format matching example:");
        System.out.println("String: " + stringTime + "ms, StringBuilder: " + stringBuilderTime + "ms, StringBuffer: " + stringBufferTime + "ms");

    }
}
