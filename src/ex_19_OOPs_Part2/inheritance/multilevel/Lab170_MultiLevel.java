package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        Son s1 = new Son();
        // Son s2 = new Father(); Invalid
        Father f1 = new Son(); // Dynamic Dispatch
        GrandFather gf1 = new Son(); // Dynamic Dispatch
    }
}
