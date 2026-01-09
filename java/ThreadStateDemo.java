public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
        });

        System.out.println(t.getState());
        t.start();
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
