package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class Vehicle {
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }

    Vehicle() {
        System.out.println("Default Constructor of Vehicle class");
    }

    Vehicle(int a) {
        System.out.println("Param Constructor with 1 arg");
    }

    Vehicle(int a, int b) {
        System.out.println("Param Constructor with 2 args");
    }

    void message() {
        System.out.println("No Retuns, No Args");
    }

    void message(int a) {
        System.out.println("Param method with 1 argu");
    }

    void display() {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car() {
        super(100);
    }
    void test() {
        System.out.println("test() from Car class");
    }

    Car(int a) {
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Override of display() of Car!");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();

    }
}