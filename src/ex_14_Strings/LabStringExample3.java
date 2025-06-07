package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "HelloWorld".substring(5);
        System.out.println(s);

        String s1 = "HelloWorld".substring(5, 7);
        System.out.println("s1: "+s1);

        CharSequence cs = "HelloWorld".subSequence(5,7);
        System.out.println(cs);

        char[] carr = "Java".toCharArray();
        System.out.println(carr); // ['J','a','v','a']

        String s2 = " Java ".trim();
        System.out.println(s2);

        boolean b = "".isEmpty();
        System.out.println(b); // true

        boolean b1 = "".isBlank();
        System.out.println(b1);

        boolean b2 = " ".isEmpty();
        System.out.println(b2);

        boolean b3 = " ".isBlank();
        System.out.println(b3);

        boolean b4 = "Susagar Divi".isBlank();
        System.out.println(b4);

        String s111 = String.format("%s = %d", "age", 25);
        System.out.println(s111);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

    }
}
