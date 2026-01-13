public class WaitNotifyMissedSignal {

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        synchronized (lock) {
            lock.notify(); // nobody waiting
        }

        synchronized (lock) {
            lock.wait(); // waits forever
        }
    }
}
