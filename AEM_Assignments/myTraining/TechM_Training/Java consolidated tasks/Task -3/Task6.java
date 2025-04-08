import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LastModifiedChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        checkLastModifiedDate(filePath);
    }

    public static void checkLastModifiedDate(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        long lastModifiedTime = file.lastModified();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

        System.out.println("Last Modified Date: " + dateFormat.format(lastModifiedTime));
    }
}
