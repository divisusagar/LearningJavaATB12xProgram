package ex_19_OOPs_Part2.poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.p1();
        p.home();

        Father f = new Father();
        f.f1();
        f.home();

        Father f1 = new Pramod();
        f1.home();
    }
}
