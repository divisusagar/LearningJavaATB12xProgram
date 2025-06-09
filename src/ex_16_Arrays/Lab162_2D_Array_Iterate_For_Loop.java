package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{11, 22}, {33, 44}, {55, 66}};
//        System.out.println(matrix1.length);
//        System.out.println(matrix2.length);
        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
