public class FalseSharingDemo {

    static class Counter {
        volatile long value = 0L;
    }

    static Counter c1 = new Counter();
    static Counter c2 = new Counter();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                c1.value++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                c2.value++;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}


