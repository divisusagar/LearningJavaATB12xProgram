package Tasks.Task_09Jun2025;

public class Mobile {
    private String brand;
    private double price;
    Mobile(String brand) {
        this.brand=brand;
        this.price=0.0;
    }
    Mobile(String brand, double price) {
        this.brand=brand;
        this.price=price;
    }

    public void displayMobile() {
        System.out.println("Mobile Brand: "+brand);
        if(price > 0) {
            System.out.print("Mobile Price: Rs "+price);
        } else {
            System.out.println("Price: Not Specified");
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple",55000);
        m1.displayMobile();
        m2.displayMobile();
    }
}
