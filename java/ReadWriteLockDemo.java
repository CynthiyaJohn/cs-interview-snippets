import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

    private static int data = 0;
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        Runnable reader = () -> {
            lock.readLock().lock();
            try {
                System.out.println("Read: " + data);
            } finally {
                lock.readLock().unlock();
            }
        };

        Runnable writer = () -> {
            lock.writeLock().lock();
            try {
                data++;
                System.out.println("Written: " + data);
            } finally {
                lock.writeLock().unlock();
            }
        };

        new Thread(reader).start();
        new Thread(writer).start();
    }
}
