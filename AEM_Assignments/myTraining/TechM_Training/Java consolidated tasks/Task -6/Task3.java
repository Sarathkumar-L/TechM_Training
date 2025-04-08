import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static <T> List<T> getReversedList(List<T> items) {
        List<T> reversedItems = new ArrayList<>(items);
        Collections.reverse(reversedItems);
        return reversedItems;
    }

    public static void main(String[] args) {
        List<Integer> values = List.of(10, 20, 30, 40, 50);
        System.out.println("Reversed Collection: " + getReversedList(values));
    }
}
