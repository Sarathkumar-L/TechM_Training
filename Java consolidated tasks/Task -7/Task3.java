import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Azure", "Emerald", "Gold"));
        shades.add(0, "Crimson");
        System.out.println(shades);
    }
}
