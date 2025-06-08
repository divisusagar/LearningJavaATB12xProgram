package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        boolean[] is_married_people = {true,false};


        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        System.out.println(is_married_people[1]);
        // System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 7
        // System.out.println(marks[7]); // ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7

        char c = 'A';
        String name = "pramod";
        String[] name_each_element_char = name.split("");

    }
}
