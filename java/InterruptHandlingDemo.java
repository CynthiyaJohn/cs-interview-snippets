//Concept: Thread interruption
public class InterruptHandlingDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted safely");
            }
        });

        worker.start();
        Thread.sleep(2000);
        worker.interrupt();
    }
}
