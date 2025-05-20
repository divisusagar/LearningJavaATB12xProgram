package ex_02_Java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a;
        //System.out.println(a); // JVM never auto assign the default value of non-initialized variables
        a = 90;
        System.out.println(a);

        final int b = 99;
        System.out.println(b);
        // b = 100; // cannot assign a value to final variable b
        // b = b+1; // cannot assign a value to final variable b

        final float PI = 3.14f;
        final float PI1 = 3.14f;
        final float PI2 = 3.14f;
        final float PI4 = 3.14f;

        // final int a = 11; // variable a is already defined in method main
        final int a1 = 10;

    }
}
