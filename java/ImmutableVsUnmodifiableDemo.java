import java.util.*;

public class ImmutableVsUnmodifiableDemo {

    public static void main(String[] args) {

        List<String> original = new ArrayList<>();
        original.add("A");

        List<String> unmodifiable = Collections.unmodifiableList(original);
        original.add("B");

        System.out.println(unmodifiable);
    }
}
