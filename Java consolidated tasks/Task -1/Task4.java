import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int[] originalArray = {5, 15, 25, 35, 45};
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 4);

        System.out.println("Extracted Elements: " + Arrays.toString(copiedArray));
    }
}
