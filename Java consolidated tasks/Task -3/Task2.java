
import java.io.File;
import java.util.Scanner;

public class FileFilterByExtension {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the folder path to search: ");
        String folderPath = scanner.nextLine();
        
        System.out.println("Enter the file extension to filter (e.g., txt, java, png): ");
        String fileExtension = scanner.nextLine();
        
        filterFilesByExtension(folderPath, fileExtension);
    }

    public static void filterFilesByExtension(String folderPath, String extension) {
        File directory = new File(folderPath);
        File[] filesList = directory.listFiles();
        boolean isFound = false;
        int fileCount = 0;

        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    String fileExt = fileName.substring(fileName.lastIndexOf('.') + 1);

                    if (fileExt.equalsIgnoreCase(extension)) {
                        System.out.println("File found: " + fileName + " (Extension: " + fileExt + ")");
                        isFound = true;
                        fileCount++;
                    }
                } else if (file.isDirectory()) {
                    filterFilesByExtension(file.getAbsolutePath(), extension);
                }
            }
        }

        if (!isFound) {
            System.out.println("No files with extension '" + extension + "' found in " + folderPath);
        } else {
            System.out.println("Total files found in '" + folderPath + "' with extension '" + extension + "': " + fileCount);
        }
    }
}
