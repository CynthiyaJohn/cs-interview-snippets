class DeadlockVsStarvation {

    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {

        // Deadlock example
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                sleep();
                synchronized (lockB) {
                    System.out.println("Thread 1 acquired both locks");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                sleep();
                synchronized (lockA) {
                    System.out.println("Thread 2 acquired both locks");
                }
            }
        });

        t1.start();
        t2.start();
    }

    private static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {}
    }
}
