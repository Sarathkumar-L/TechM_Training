
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileToByteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
      
        if (!file.exists() || !file.isFile()) {
            System.out.println("Error: The specified file does not exist or is not a valid file.");
        } else {
            try {
                byte[] fileBytes = readFileToByteArray(file);

                System.out.println("File read successfully. Byte array length: " + fileBytes.length);
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static byte[] readFileToByteArray(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            return byteArray;
        }
    }
}
