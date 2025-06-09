package ex_16_Arrays;

import java.util.Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] numbers = {10,25,3,14,5};
        int[] rev_numbers = new int[5];
        //int i,j = 0;

        for (int i=numbers.length-1, j=0; i>=0 && j<5; i--,j++) {
            rev_numbers[j]=numbers[i];
            //j++;
        }
//        for (int num : rev_numbers) {
//            System.out.println(num);
//        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(rev_numbers));
    }
}
