import java.util.List;

public class Task2 {
    public static <T> int getFirstOccurrenceIndex(List<T> collection, T item) {
        return collection.indexOf(item);
    }

    public static void main(String[] args) {
        List<String> people = List.of("Emma", "Liam", "Olivia", "Liam");
        System.out.println("Position of 'Liam': " + getFirstOccurrenceIndex(people, "Liam")); // 1
        System.out.println("Position of 'Sophia': " + getFirstOccurrenceIndex(people, "Sophia")); // -1
    }
}
