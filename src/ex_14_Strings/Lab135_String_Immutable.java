package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Susagar"; // SCP (String Constant Pool)
        name.toUpperCase();
        System.out.println(name); //Susagar
        System.out.println(name.toUpperCase()); //SUSAGAR
    }
}
