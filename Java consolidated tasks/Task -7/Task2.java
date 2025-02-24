import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> colorPalette = new ArrayList<>(List.of("Crimson", "Azure", "Emerald", "Gold"));

        for (String shade : colorPalette) {
            System.out.println(shade);
        }
    }
}
