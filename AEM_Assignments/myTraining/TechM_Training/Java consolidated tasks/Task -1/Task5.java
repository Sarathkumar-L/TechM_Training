import java.util.Scanner;

public class AlternateUppercase {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a string: ");
        StringBuilder updatedString = new StringBuilder(userInput.nextLine());

        for (int position = 0; position < updatedString.length(); position += 2) {
            String currentChar = updatedString.charAt(position) + "";

            if (Character.isDigit(currentChar.charAt(0))) {
                continue;
            }

            updatedString.setCharAt(position, currentChar.toUpperCase().charAt(0));
        }

        System.out.println("Transformed String: " + updatedString);
    }
}
