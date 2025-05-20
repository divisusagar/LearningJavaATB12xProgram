package ex_04_Operators;

public class Lab037_Operators_Arithmetic_Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder
        int a = 20;
        int b = 3;
        float c = 3.0f;
        int d = 4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println(" --- ");
        System.out.printf("%d Modulus %d is: %d",a,b,a%b);
        System.out.println();
        System.out.printf("%d Modulus %d is: %d",a,d,a%d);
    }
}
