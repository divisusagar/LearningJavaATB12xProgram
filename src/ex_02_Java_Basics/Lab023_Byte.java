package ex_02_Java_Basics;

public class Lab023_Byte {
    /* byte: 8-bit signed integer, ranging from -128 to 127. */
    public static void main(String[] args) {
        byte age = 10;
        System.out.println(age);
    }

    // the below main method with int argument is not complied
    public static void main(int args) {

        byte age = 11;
        System.out.println(age);

    }
}
