package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode){
            case 001,002: // we can use the comma seperated case values
                System.out.println("Its either 001 OR 002");
                break;
            case 003, 004:
                System.out.println("Its either 003 OR 004");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
