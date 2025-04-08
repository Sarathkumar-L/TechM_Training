import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static <T> List<T> combineAlternately(List<T> firstList, List<T> secondList) {
        List<T> combinedList = new ArrayList<>();
        int firstSize = firstList.size(), secondSize = secondList.size();
        int index = 0;

        while (index < firstSize || index < secondSize) {
            if (index < firstSize) combinedList.add(firstList.get(index));
            if (index < secondSize) combinedList.add(secondList.get(index));
            index++;
        }

        return combinedList;
    }

    public static void main(String[] args) {
        List<String> alphaList = List.of("X", "Y", "Z");
        List<String> numList = List.of("1", "2", "3", "4");

        System.out.println("Interleaved List: " + combineAlternately(alphaList, numList));
    }
}
