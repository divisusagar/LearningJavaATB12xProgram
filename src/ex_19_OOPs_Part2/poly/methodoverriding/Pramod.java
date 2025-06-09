package ex_19_OOPs_Part2.poly.methodoverriding;

public class Pramod extends Father {
    void p1() {
        System.out.println("Pramod - p1");
    }

    @Override
    void home() {
        System.out.println("Pramod Home - 3BHK");
    }
}
