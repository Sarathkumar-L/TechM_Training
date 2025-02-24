
import java.io.Console;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available. Run the program in a terminal.");
            return;
        }

        String userInput = console.readLine("Enter some text: ");
        System.out.println("You entered: " + userInput);
    }
}
