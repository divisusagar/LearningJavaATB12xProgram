package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text -> Hello World
        sb.reverse();        // dlroW olleH
        System.out.println(sb); // dlroW olleH
    }
}
