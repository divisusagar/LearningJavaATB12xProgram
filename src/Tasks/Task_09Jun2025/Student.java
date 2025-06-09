package Tasks.Task_09Jun2025;

public class Student {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Student Name -> "+name);
        System.out.println("Student Age -> "+age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Susagar Divi",34);
        Student s2 = new Student("Pavan Divi",31);
        s1.display();
        s2.display();
    }
}
