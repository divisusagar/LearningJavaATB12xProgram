package Tasks.Task_09Jun2025;

public class Book {
    private String title, author;
    private int price;
    Book(String title, String author, int price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display() {
        System.out.println("Book Title -> "+title);
        System.out.println("Book Author -> "+author);
        System.out.println("Book Price -> "+price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire","Abdul Kalam",115);
        b1.display();
    }
}
