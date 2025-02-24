
import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Error: The specified file does not exist or is not a valid file.");
        } else {

            long fileSizeInBytes = file.length();

            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("\nFile Size:");
            System.out.println(fileSizeInBytes + " Bytes");
            System.out.printf("%.2f KB%n", fileSizeInKB);
            System.out.printf("%.2f MB%n", fileSizeInMB);
        }

        scanner.close();
    }
}
