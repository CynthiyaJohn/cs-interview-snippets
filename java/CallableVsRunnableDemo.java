import java.util.concurrent.*;

public class CallableVsRunnableDemo {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(300);
            return 10 + 20;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Result: " + future.get());

        executor.shutdown();
    }
}
