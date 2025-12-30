//Concept: Class-loading based singleton
public class InitializationOnDemandHolder {

    private InitializationOnDemandHolder() {}

    private static class Holder {
        private static final InitializationOnDemandHolder INSTANCE =
                new InitializationOnDemandHolder();
    }

    public static InitializationOnDemandHolder getInstance() {
        return Holder.INSTANCE;
    }
}

//JVM class loading guarantees thread safety.
