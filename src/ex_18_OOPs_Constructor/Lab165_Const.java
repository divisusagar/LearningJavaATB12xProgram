package ex_18_OOPs_Constructor;

public class Lab165_Const {
    public static void main(String[] args) {
        Car2 tesla = new Car2();
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 nano = new Car2("nano",2011);
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 bmw = new Car2("bmw model");
        System.out.println(bmw.model);
        System.out.println(bmw.year);
    }
}
