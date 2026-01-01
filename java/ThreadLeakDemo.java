public class ThreadLeakDemo {

    public static void main(String[] args) {

        while (true) {
            new Thread(() -> {
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException ignored) {}
            }).start();
        }
    }
}
