package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Susagar";
        String last_name = "Divi";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // SusagarDivi1010
        System.out.println(a + b + first_name + last_name); // 20SusagarDivi

        System.out.println(first_name + last_name + (a + b)); // SusagarDivi20

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
