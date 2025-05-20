package ex_02_Java_Basics;

public class Lab014_Variables {
    public static void main(String[] args) {
        byte age = 60;
        // age = age+1; // Compilation error
            // In Java, arithmetic operations like age + 1 automatically promote smaller types (byte, short, char) to int
            // results in an int, and you're trying to assign that int result back to a byte variable (age), which isn't allowed without explicit casting.
        System.out.println(age);
        System.out.println();
        age = (byte)(age + 1);  // Now it compiles
        System.out.println(age);
        System.out.println((byte)(age+2));

    }
}
