import java.util.ArrayList;
import java.util.List;

public final class ImmutableClassDemo {

    private final String name;
    private final List<String> skills;

    public ImmutableClassDemo(String name, List<String> skills) {
        this.name = name;
        this.skills = new ArrayList<>(skills); // defensive copy
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills); // defensive copy
    }
}
