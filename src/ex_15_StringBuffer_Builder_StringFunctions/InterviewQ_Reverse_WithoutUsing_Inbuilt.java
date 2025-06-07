package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String input = "Pramod";
        String reverse_output = "";
        System.out.println("Input String: "+input);
        for (int i= input.length()-1;i>=0;i--)
        {
            // System.out.print(input.charAt(i));
            reverse_output = reverse_output + input.charAt(i);
        }
        System.out.println("Reverse String: "+reverse_output);

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}
