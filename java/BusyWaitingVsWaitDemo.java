public class BusyWaitingVsWaitDemo {

    private static final Object lock = new Object();
    private static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            synchronized (lock) {
                while (!ready) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignored) {}
                }
                System.out.println("Proceeding");
            }
        });

        t.start();
        Thread.sleep(1000);

        synchronized (lock) {
            ready = true;
            lock.notify();
        }
    }
}
