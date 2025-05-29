package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {
        for (int i = 0 ; i < 50; i++) {
            if (i == 5) {
                continue; // Output : Skip printing the 5 i.e. 1 to 4, 6 to 49
            }
            System.out.println(i);
        }
    }
}
