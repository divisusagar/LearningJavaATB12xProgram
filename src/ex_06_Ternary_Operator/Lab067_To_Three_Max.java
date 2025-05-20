package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int n3 = 5;

        int result = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(result);
        if (result == n1)
            System.out.printf("Max value is n1 : %d",n1);
        else if (result == n2)
            System.out.printf("Max value is n2 : %d",n2);
        else
            System.out.printf("Max value is n3 : %d",n3);


    }
}
