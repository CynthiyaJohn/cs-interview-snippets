public class HappensBeforeDemo {

    private static int value = 0;
    private static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {

        Thread writer = new Thread(() -> {
            value = 42;
            ready = true;
        });

        Thread reader = new Thread(() -> {
            if (ready) {
                System.out.println(value);
            }
        });

        writer.start();
        writer.join();
        reader.start();
    }
}
