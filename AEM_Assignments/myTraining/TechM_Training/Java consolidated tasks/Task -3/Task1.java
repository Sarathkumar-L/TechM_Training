import java.io.File;
import java.util.Scanner;

public class DirectoryExplorer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path: ");
        String folderPath = scanner.nextLine();

        listFilesAndDirectories(folderPath);
    }

    public static void listFilesAndDirectories(String folderPath) {
        File directory = new File(folderPath);

        if (directory.isDirectory()) {
            System.out.println("\nContents of directory: " + directory.getName());
            File[] filesList = directory.listFiles();

            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("\nEntering subdirectory: " + file.getName());
                    listFilesAndDirectories(file.getAbsolutePath());
                }
            }
        } else if (directory.isFile()) {
            System.out.println("Specified path is a file: " + directory.getName());
        } else {
            System.out.println("Invalid directory path. Please check and try again.");
        }
    }
}
