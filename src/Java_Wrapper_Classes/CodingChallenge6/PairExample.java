package Java_Wrapper_Classes.CodingChallenge6;

// Generic Pair class
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Display method
    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class PairExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Test", 100);
        pair.display();  // Output: First: Test, Second: 100
    }
}
