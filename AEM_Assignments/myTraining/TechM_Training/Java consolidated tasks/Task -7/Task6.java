
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Crimson", "Azure", "Emerald", "Gold"));
        shades.remove(2);
        System.out.println(shades);
    }
}
