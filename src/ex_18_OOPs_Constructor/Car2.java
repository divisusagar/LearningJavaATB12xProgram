package ex_18_OOPs_Constructor;

public class Car2 {
    String model;
    int year;

    Car2(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    Car2(String model_name,int year_created){
        model = model_name;
        year = year_created;

    }

    Car2(String model_name){
        model = model_name;
    }

}
