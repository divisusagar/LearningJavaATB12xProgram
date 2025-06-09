package ex_20_OOPs_Super_Abstraction;

public class Lab184_Private {
    public static void main(String[] args) {
        CAB cab = new CAB();
        cab.display();
    }
}

class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ {
    void display() {
        System.out.println(super.my_gold);
    }
}
