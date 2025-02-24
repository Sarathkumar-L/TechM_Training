
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5_Modified {

    static class BlankFileException extends Exception {
        public BlankFileException(String message) {
            super(message);
        }
    }

    public static void fetchFileData(String fileLocation) throws FileNotFoundException, BlankFileException {
        File myFile = new File(fileLocation);

        if (!myFile.exists()) {
            throw new FileNotFoundException("Alert: No file found at location: " + fileLocation);
        }

        if (myFile.length() == 0) {
            throw new BlankFileException("Alert: The file contains no data!");
        }

        try (Scanner fileScanner = new Scanner(myFile)) {
            System.out.println("Reading file content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Provide the file location: ");
        String fileLocation = userInput.nextLine();

        try {
            fetchFileData(fileLocation);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BlankFileException e) {
            System.out.println(e.getMessage());
        }

        userInput.close();
    }
}
