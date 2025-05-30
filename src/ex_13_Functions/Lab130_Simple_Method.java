package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_type_func();
        int a = return_type_func();
        System.out.println(a);
    }
    static void non_return_type_func() {
        System.out.println("Hi, Non Return Type");
    }

    static int return_type_func() {
        System.out.println("Hi, Return Type");
        return 10;
    }

//    static int non_return_type_func() {
//        return 20;
//    }
}
