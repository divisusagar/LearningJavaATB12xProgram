package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        //int age = 18;
        //int user_input = args[0]; // incompatible types: java.lang.String cannot be converted to int
        System.out.println("Enter the Age:");
        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);
        System.out.println("----");
        int age = Integer.parseInt(user_input);
        System.out.println(age);
        //Integer age = Integer.parseInt(user_input);
        // System.out.println(age instanceof Integer);

        String result = (age > 18) ? (age < 65) ? "Adult" : "Senior Citizen": "Minor";
         System.out.println(result);

//        String result1 = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
//        System.out.println(result1);
    }
}
