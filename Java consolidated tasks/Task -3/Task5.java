
import java.io.File;
import java.util.Scanner;

public class PathTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file or directory path: ");
        File file = new File(scanner.nextLine());

        checkPathType(file);
    }

    public static void checkPathType(File file) {
        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
            return;
        }

        if (file.isDirectory()) {
            System.out.println("It is a directory!");
        } else {
            System.out.println("It is a file!");
        }
    }
}
