package ex_04_Operators;

public class Lab041_Logical_Operators {

//    Logical AND (&&): Returns true if both operands are true; otherwise, it returns false.
//    Logical OR (||): Returns true if at least one of the operands is true; it returns false only if both operands are false.
//    Logical NOT (!): Returns the opposite of the operand's value. If the operand is true, it returns false, and vice versa.

//    Java also has bitwise logical operators (&, |, ^) which can be used with boolean operands,
//    but they always evaluate both operands, unlike && and || which can short-circuit.

    public static void main(String[] args) {
        boolean a = true;
        System.out.println("a is "+a);
        System.out.println("!a is " +!a);

        boolean b = false;
        System.out.println("b is "+b);
        System.out.println("!!b is "+!!b);

        boolean c= a || b;

        System.out.println("a || b is "+c);

        boolean d= a && b;
        System.out.println("a && b is "+d);

    }
}
