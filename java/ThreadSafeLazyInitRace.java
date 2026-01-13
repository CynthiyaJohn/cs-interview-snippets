public class ThreadSafeLazyInitRace {

    private static Object instance;

    public static Object getInstance() {
        if (instance == null) { // NOT thread-safe
            instance = new Object();
        }
        return instance;
    }

    public static void main(String[] args) {
        Runnable task = () -> System.out.println(getInstance());
        new Thread(task).start();
        new Thread(task).start();
    }
}
