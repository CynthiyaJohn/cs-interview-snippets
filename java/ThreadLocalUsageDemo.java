public class ThreadLocalUsageDemo {

    private static ThreadLocal<Integer> counter =
            ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            counter.set(counter.get() + 1);
            System.out.println(Thread.currentThread().getName()
                    + " -> " + counter.get());
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
