package ex_04_Operators;

public class Lab041_Bitwise_Logical_Operators {
    public static void main(String[] args) {
        //    Java also has bitwise logical operators (&, |, ^) which can be used with boolean operands,
        //    but they always evaluate both operands, unlike && and || which can short-circuit.

        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND (&)
        // Sets each bit to 1 if both corresponding bits are 1.
        int andResult = a & b; // 0101 & 0011 = 0001 (Decimal 1)
        System.out.println("a & b = " + andResult);

        // Bitwise OR (|)
        // Sets each bit to 1 if at least one of the corresponding bits is 1.
        int orResult = a | b; // 0101 | 0011 = 0111 (Decimal 7)
        System.out.println("a | b = " + orResult);

        // Bitwise XOR (^)
        // Sets each bit to 1 if the corresponding bits are different.
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (Decimal 6)
        System.out.println("a ^ b = " + xorResult);
    }
}
