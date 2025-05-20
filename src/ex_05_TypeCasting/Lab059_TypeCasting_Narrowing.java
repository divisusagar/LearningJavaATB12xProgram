package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300; // int is 32 bits, so 300 =>  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0


        // byte b = val; // Narrowing - Implicit JVM to do it. - incompatible types: possible lossy conversion from int to byte

        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        // byte is 8 bits memory,so last 8 its =>  0 0 1 0 1 1 0 0
        // (00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀
        //              = 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
        System.out.println(b1); // 44
    }
}
