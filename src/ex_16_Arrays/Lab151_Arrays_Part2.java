package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names =  {"pramod","amit","lucky"};
        System.out.println(names.length);
        //System.out.println(names[0]);
        //System.out.println(names[2]);
        //System.out.println(names[1]);
        for(String name: names){
            System.out.println(name);
        }

        String[] name_atb12x = new String[3];
        name_atb12x[0] = "Aditi";
        name_atb12x[1] = "Jitin";
        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
    }
}
