
import java.util.Arrays;

public class AlternateElement {
    public static void main(String[] args) {
       
        int[] originalArray = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        
        int newSize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newSize];

       int j=0;
        for (int i = 0,  i < originalArray.length; i += 2) {
            alternateArray[j] = originalArray[i];
j++;
        }

        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements Array: " + Arrays.toString(alternateArray));
    }
}
