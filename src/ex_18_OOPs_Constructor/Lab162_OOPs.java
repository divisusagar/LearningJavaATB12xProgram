package ex_18_OOPs_Constructor;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
    }

}

class Baby{
    String name;

    // Default Constructor
    Baby() {
        // This is called automatically when a object is created
        System.out.println("Iam called, Object is created");
    }
}
