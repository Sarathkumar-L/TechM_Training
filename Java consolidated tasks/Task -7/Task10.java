import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Crimson", "Azure", "Emerald", "Amber"));
        Collections.shuffle(shades);
        System.out.println(shades);
    }
}
