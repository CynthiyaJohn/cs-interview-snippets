public class BiasedLockingConcept {

    public static void main(String[] args) {
        Object lock = new Object();

        synchronized (lock) {
            System.out.println("Lock acquired by single thread");
        }
    }
}
