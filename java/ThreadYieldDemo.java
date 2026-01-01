public class ThreadYieldDemo {

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            }
        };

        new Thread(task, "T1").start();
        new Thread(task, "T2").start();
    }
}
