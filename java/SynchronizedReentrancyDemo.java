public class SynchronizedReentrancyDemo {

    synchronized void outer() {
        inner();
    }

    synchronized void inner() {
        System.out.println("Reentrant lock works");
    }

    public static void main(String[] args) {
        new SynchronizedReentrancyDemo().outer();
    }
}
