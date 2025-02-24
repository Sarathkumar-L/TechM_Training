import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "apricot", "banana", "avocado", "cherry", "blueberry");

        char targetLetter = 'a';

        long count = words.stream()
                .filter(word -> word.startsWith(String.valueOf(targetLetter)))
                .count();

        System.out.println("Count of words starting with '" + targetLetter + "': " + count);
    }
}
