import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Crimson", "Azure", "Emerald"));
        shades.set(1, "Violet");
        System.out.println(shades);
    }
}
