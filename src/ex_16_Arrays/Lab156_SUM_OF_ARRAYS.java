package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] numbers = {12,34,10};
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        System.out.println("Sum of array elements: "+sum);
    }
}
