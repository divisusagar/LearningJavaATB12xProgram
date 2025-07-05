package Java_Wrapper_Classes.CodingChallenge7;

public class MaxValueExample {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 5, 30, 15};

        // Assume the first element is the maximum
        Integer max = numbers[0];

        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
    }
}
