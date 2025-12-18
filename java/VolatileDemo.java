class SharedFlag {
    volatile boolean running = true;
}

public class VolatileDemo {

    public static void main(String[] args) throws InterruptedException {

        SharedFlag flag = new SharedFlag();

        Thread worker = new Thread(() -> {
            while (flag.running) {
                // busy wait
            }
            System.out.println("Stopped by main thread");
        });

        worker.start();
        Thread.sleep(1000);

        flag.running = false;
    }
}
