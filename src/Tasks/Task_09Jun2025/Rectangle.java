package Tasks.Task_09Jun2025;

public class Rectangle {
    private double length, breadth, area;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area of Rectangle: "+area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.5,5.5);
        r1.calculateArea();
    }
}
