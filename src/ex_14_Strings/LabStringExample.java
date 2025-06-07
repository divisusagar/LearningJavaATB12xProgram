package ex_14_Strings;

public class LabStringExample {
    public static void main(String[] args) {
        String s = "JAva";
        char c1 = s.charAt(1);
        System.out.println(c1); // A
        System.out.println(s.codePointAt(1)); //65

        char c2 = s.charAt(3);
        System.out.println(c2); // a
        System.out.println(s.codePointAt(3)); // 97

        //compareToIgnoreCase(String)
        int result = "abc".compareToIgnoreCase("ABC");
        int result1 = "abc".compareTo("ABC");
        System.out.println(result); // 0 -> true
        System.out.println(result1); // 32 -> i.e. ASCII Code a - A -> 97-65=32

        int idx1 = "Java".indexOf("a");
        System.out.println(idx1); // 1 i.e. 1st occurance

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2); //3

        boolean b = "".isEmpty();
        System.out.println(b); // true

        String s11 = String.join("-","Java","Python","Selenium");
        System.out.println(s11);

        String s12 = "Java".replace("a","o");
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
    }
}
