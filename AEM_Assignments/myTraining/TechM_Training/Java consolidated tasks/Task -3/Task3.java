import java.io.File;
import java.util.Scanner;

public class FileOrDirectoryChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the file or directory path: ");
        String path = scanner.nextLine();

        if (doesExist(path)) {
            System.out.println("The specified file or directory exists!");
        } else {
            System.out.println("The specified file or directory does NOT exist.");
        }
    }

    public static boolean doesExist(String path) {
        File file = new File(path);
        return file.exists();
    }
}
