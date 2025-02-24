
import java.io.File;
import java.util.Scanner;

public class FilePermissionChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file or directory path: ");
        String path = scanner.nextLine();

        int permissionLevel = checkPermissions(path);

        switch (permissionLevel) {
            case -1:
                System.out.println("File or directory not found!");
                break;
            case 0:
                System.out.println("No permissions for this file!");
                break;
            case 1:
                System.out.println("Read-only file.");
                break;
            case 2:
                System.out.println("Read and write permissions.");
                break;
            case 3:
                System.out.println("Read, write, and execute permissions.");
                break;
        }
    }

    public static int checkPermissions(String path) {
        File file = new File(path);

        if (!file.exists()) {
            return -1;
        }

        int flag = 0;
        if (file.canRead()) {
            flag = 1;
            if (file.canWrite()) {
                flag = 2;
                if (file.canExecute()) {
                    flag = 3;
                }
            }
        }
        return flag;
    }
}
