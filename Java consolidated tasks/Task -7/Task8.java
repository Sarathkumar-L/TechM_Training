import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Gold", "Azure", "Emerald", "Crimson"));
        Collections.sort(shades);
        System.out.println(shades);
    }
}
