import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " acquired permit");
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            } finally {
                semaphore.release();
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
