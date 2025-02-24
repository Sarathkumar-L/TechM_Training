
import java.util.List;

public class Task1 {
    public static <T extends Number> void calculateEvenOddSums(List<T> values) {
        double sumOfEvens = 0, sumOfOdds = 0;
        for (T value : values) {
            if (value.intValue() % 2 == 0) {
                sumOfEvens += value.doubleValue();
            } else {
                sumOfOdds += value.doubleValue();
            }
        }
        System.out.println("Total of Even Numbers: " + sumOfEvens);
        System.out.println("Total of Odd Numbers: " + sumOfOdds);
    }

    public static void main(String[] args) {
        List<Integer> sampleNumbers = List.of(3, 8, 5, 12, 7, 10, 15);
        calculateEvenOddSums(sampleNumbers);
    }
}
