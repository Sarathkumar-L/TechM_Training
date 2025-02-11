final class ImmutableClass {
    private final int fixedNumber = 200;

    public final void showMessage() {
        System.out.println("Executing a final method within a final class.");
    }

    public int getFixedNumber() {
        return fixedNumber;
    }
}

public class FinalExample {
    public static void main(String[] args) {
        ImmutableClass instance = new ImmutableClass();
        instance.showMessage();
        System.out.println("Fixed Number Value: " + instance.getFixedNumber());
    }
}
