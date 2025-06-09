package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {-12,34,10,1,100,3,4,132};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[numbers.length-2]);

//        int highest = 0;
//        int secondHighest = 0;
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num: numbers) {
            if (num>highest) {
                secondHighest = highest;
                highest = num;
            }
//            else if (num> secondHighest && num != highest) {
//                secondHighest = num;
//            }
        }
        System.out.println("Highest: "+highest);
        System.out.println("Second Highest: "+secondHighest);

    }
}
