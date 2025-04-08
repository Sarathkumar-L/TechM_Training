
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("Error: File not found at path: " + filePath);
        }

        if (!file.canRead()) {
            throw new SecurityException("Error: No read permissions for the file: " + filePath);
        }
        try (Scanner scanner = new Scanner(file)) {
            System.out.println("\nFile content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;

        do {
            System.out.print("Enter the file path: ");
            filePath = scanner.nextLine().trim();
            if (filePath.isEmpty()) {
                System.out.println("File path cannot be empty. Please enter a valid path.");
            }
        } while (filePath.isEmpty());

        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
