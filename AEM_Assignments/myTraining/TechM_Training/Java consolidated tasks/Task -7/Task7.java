import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> shades = new ArrayList<>(List.of("Crimson", "Azure", "Emerald", "Gold"));
        System.out.println("Contains Azure? " + shades.contains("Azure"));
    }
}
