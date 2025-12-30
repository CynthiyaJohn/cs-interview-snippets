//Instruction reordering
public class MemoryReorderingDemo {

    static int x = 0, y = 0;
    static int r1 = 0, r2 = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            x = 1;
            r1 = y;
        });

        Thread t2 = new Thread(() -> {
            y = 1;
            r2 = x;
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("r1=" + r1 + ", r2=" + r2);
    }
}
