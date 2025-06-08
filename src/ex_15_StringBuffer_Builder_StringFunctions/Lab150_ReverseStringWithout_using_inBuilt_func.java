package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab150_ReverseStringWithout_using_inBuilt_func {
    public static void main(String[] args) {
        String p="Poonam";

        for (int i = p.length()-1; i>=0 ; i--) {
            System.out.print(p.charAt(i));
        }
    }
}
