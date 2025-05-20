package ex_02_Java_Basics;

public class Lab024_printF {
    // %d -> byte, short, int, long
    // %f -> float, double
    // %b -> boolean
    // %s -> string

    public static void main(String[] args) {

        byte by = 127;
        System.out.printf("Byte by = %d",by).println();

        short sh = 32767;
        System.out.printf("Short sh = %d",sh);

        int a = 10;
        System.out.println(a);
        System.out.printf("Your variable is %d", a);
        System.out.println();
        int b = 20;
        //  A format string as described in Format string syntax
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("a value: %d, b value: %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();
        System.out.println("a = " + a + ", b = " + b);

        long l = 9223372036854775807L;
        System.out.printf("Long l =%d",l).println();

        float f = 3.14f;
        System.out.printf("Float f = %f",f).println();

        double d = 987644899;
        System.out.printf("Double d = %f",d).println();

        boolean is_true = true;
        boolean is_false = false;
        System.out.printf("%b,%b",is_true,is_false).println();

       // string s = "Susagar Divi"; // string (lower-case) datatype invalid
        String s = "Susagar Divi";
        System.out.printf("My Name is %s",s);
    }
}
