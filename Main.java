import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List L = new List();
        L.print();
        for (int i = 0; i < 10; i++) {
            L.addBack(ThreadLocalRandom.current().nextInt(25));
        }
        L.print();
        L.reverse();
        L.print();
    }
}