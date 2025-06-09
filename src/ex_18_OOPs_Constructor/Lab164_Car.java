package ex_18_OOPs_Constructor;

public class Lab164_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Testla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
