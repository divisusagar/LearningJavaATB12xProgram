package Tasks;

import java.util.Scanner;

public class Task3_Triangle_Type {
    //    An Equilateral triangle has three equal sides and three equal angles.
    //    An Isosceles triangle has two equal sides and two equal angles.
    //    A Scalene triangle has three unequal sides and three unequal angles.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter the side2:");
        int side2 = scanner.nextInt();
        System.out.println("Enter the side3:");
        int side3 = scanner.nextInt();

        System.out.printf("side1=%d\tside2=%d\tside3=%d",side1,side2,side3).println();

        if (side1==side2 && side2==side3){
            System.out.println("An Equilateral triangle has three equal sides");
        }else if (side1==side2 || side2==side3 || side1==side3){
            System.out.println("An Isosceles triangle has two equal sides");
        }else
            System.out.println("A Scalene triangle has three unequal sides");

    }

}
