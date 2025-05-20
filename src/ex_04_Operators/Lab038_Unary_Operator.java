package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        int a = +10; // postivie operator - JVM Ignores
        System.out.println(a);

        int a1 = -110;
        System.out.println(a1);

        int result = a + a1;
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}

