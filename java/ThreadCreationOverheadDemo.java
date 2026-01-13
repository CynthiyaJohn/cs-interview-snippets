public class ThreadCreationOverheadDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {}).start();
        }

        System.out.println("Threads created");
    }
}
