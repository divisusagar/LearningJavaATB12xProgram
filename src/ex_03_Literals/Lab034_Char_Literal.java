package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A -> 65 as per ASCII
        System.out.println(c1);

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(c5);
//        System.out.println(c6);
//        System.out.println(c7);
//        System.out.println(c8);

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SusagarDivi");
        System.out.println("Lalitha"+new_line+"Divi");
        System.out.println("Jositha\nDivi");
        System.out.println("Pavan"+tab_line+"Divi");
        System.out.println("Venkatesh\tMerugu");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println(" ----- ");

        System.out.println("Pramod is "+carriage_return+"Dutta");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        int intChar = (int) c1;
        System.out.printf("The ASCII value of %c is: %d",c1,intChar).println();


    }
}
