package Tasks;

public class Task4 {
    public static void main(String[] args) {
        long longPhone = 8121732486l;
        //short s = ph_num; implicit narrowing not possible
        short shortPhone = (short) longPhone;
        System.out.println("longPhone: "+longPhone);
        System.out.println("shortPhone: "+shortPhone);
    }
}
