import java.util.concurrent.atomic.AtomicInteger;

public class CompareAndSwapDemo {
    public static void main(String[] args) {
        AtomicInteger value = new AtomicInteger(10);

        boolean updated = value.compareAndSet(10, 20);
        System.out.println("Updated: " + updated);
        System.out.println("Value: " + value.get());
    }
}
