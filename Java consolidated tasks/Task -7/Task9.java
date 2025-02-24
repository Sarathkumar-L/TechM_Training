import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> primaryList = new ArrayList<>(List.of("Crimson", "Azure", "Emerald"));
        ArrayList<String> duplicateList = new ArrayList<>(primaryList);
        System.out.println(duplicateList);
    }
}
