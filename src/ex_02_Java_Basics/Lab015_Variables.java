package ex_02_Java_Basics;

public class Lab015_Variables {
    public static void main(String[] args) {

        System.out.println("Java has 8 primitive data types:");

        /* byte: 8-bit signed integer, ranging from -128 to 127. */
        byte b1 = 127;    // byte is a data type & a keyword , b1 is a Identifier/Variable, = is assignment operator, 127 is Value/Literal
        // byte b2 = 128; // Incompatible types
        byte b3 = -128;
        // byte b4 = -129; // Incompatible types
        System.out.println(b1);
        // System.out.println(b2);
        System.out.println(b3);
        // System.out.println(b4);

        /* short: 16-bit signed integer, ranging from -32,768 to 32,767. */
        short s1 = -32768;
        short s2 = 32767;
        // short s3 = -32769; // Incompatible types
        // short s4 = 32768;  // Incompatible types
        System.out.println(s1);
        System.out.println(s2);

        /* int: 32-bit signed integer, ranging from -2,147,483,648 to 2,147,483,647. */
        int i1 = -2147483648;
        int i2 = 2147483647;
        // int i3 = -2147483649; // Incompatible types
        // int i4 = 2147483648;  // Incompatible types
        System.out.println(i1);
        System.out.println(i2);

        /* long: 64-bit signed integer, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. */
        // long l1 = -9223372036854775808; // Incorrect literal without Suffix L
        // long l2 = 9223372036854775807;  // Incorrect literal without Suffix L
        long l3 = -9223372036854775808L;
        long l4 = 9223372036854775807L;
        System.out.println(l3);
        System.out.println(l4);

        /* float: 32-bit single-precision floating-point number */
        /* double: 64-bit double-precision floating-point number */
        /* boolean: Represents true or false values */
        /* char: 16-bit Unicode character */

    }
}
