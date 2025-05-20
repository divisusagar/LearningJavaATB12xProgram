package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
        // concatenation
        String s1 = "Susagar";
        String s2 = "Divi";
        System.out.println(s1 + s2); // Joins => SusagarDivi
        System.out.println(s1+s2); // Joins => SusagarDivi

        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math => 30

        // + -> behave differently with the data type.
        // + -> operator overloading

        System.out.println(s1+a); // Susagar10
    }
}
