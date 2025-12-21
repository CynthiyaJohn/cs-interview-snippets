import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedVsReentrantLock {

    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public synchronized void syncIncrement() {
        count++;
    }

    public void lockIncrement() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
