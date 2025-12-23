import java.util.concurrent.*;

public class FutureTimeoutDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000);
            return "Done";
        });

        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            System.out.println("Task timed out");
        } catch (Exception ignored) {}

        executor.shutdown();
    }
}
