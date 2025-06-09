package Tasks.Task_09Jun2025;

public class Car {
    private String brand;
    private String model;
    private double price;
    Car(String brand, String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display() {
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Model: "+model);
        System.out.println("Car Price: "+price);
    }
    public static void main(String[] args) {
        Car tata = new Car("Tata Motors","Nexon",1100000);
        tata.display();
    }
}
