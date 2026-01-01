public class VisibilityWithFinalDemo {

    static class Holder {
        final int value;
        Holder(int value) {
            this.value = value;
        }
    }

    static Holder holder;

    public static void main(String[] args) {
        holder = new Holder(99);
        System.out.println(holder.value);
    }
}
//Concept: final fields & visibility guarantee
//Interview: Why final fields are safely published
