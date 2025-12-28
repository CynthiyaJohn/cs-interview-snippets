//Concept: Safe object publication
public class SafePublicationDemo {

    static class Config {
        final int value;
        Config(int value) {
            this.value = value;
        }
    }

    private static volatile Config config;

    public static void main(String[] args) {
        config = new Config(42);

        System.out.println(config.value);
    }
}
