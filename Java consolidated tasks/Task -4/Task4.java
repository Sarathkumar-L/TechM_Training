
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4_Modified {
    static class PositiveValueException extends Exception {
        public PositiveValueException(String message) {
            super(message);
        }
    }
    public static void fetchNumbersFromFile(String fileAddress) throws FileNotFoundException, PositiveValueException {
        File myFile = new File(fileAddress);

        if (!myFile.exists()) {
            throw new FileNotFoundException("Alert: No file found at location: " + fileAddress);
        }

        try (Scanner dataReader = new Scanner(myFile)) {
            System.out.println("Extracting numbers from file:");

            while (dataReader.hasNext()) {
                if (dataReader.hasNextInt()) {
                    int digit = dataReader.nextInt();
                    System.out.println(digit);

                    if (digit > 0) {
                        throw new PositiveValueException("Alert: Positive value detected: " + digit);
                    }
                } else {
                    dataReader.next(); 
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Provide the file location: ");
        String fileAddress = userInput.nextLine();

        try {
            fetchNumbersFromFile(fileAddress);
            System.out.println("All values in the file are either zero or negative.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (PositiveValueException e) {
            System.out.println(e.getMessage());
        }

        userInput.close();
    }
}
