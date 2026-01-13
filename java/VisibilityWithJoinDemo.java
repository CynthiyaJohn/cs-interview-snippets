public class VisibilityWithJoinDemo {

    static int value = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread writer = new Thread(() -> value = 42);
        writer.start();
        writer.join(); // happens-before

        System.out.println(value);
    }
}
