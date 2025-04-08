import java.util.LinkedList;

public class Task12 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry"));
        for (String item : list) {
            System.out.println(item);
        }
    }
}
