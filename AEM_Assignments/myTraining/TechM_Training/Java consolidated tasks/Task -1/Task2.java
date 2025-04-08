import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StudentRecords {

    public static void collectStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        // Storing student names and their marks in a HashMap.
        // The int[] array stores: [English, Java, C#, Python, Spanish, Total, Average]
        HashMap<String, int[]> studentData = new HashMap<>();

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("Enter the name of student %d: \n", (i + 1));
            String studentName = scanner.next();

            System.out.println("Enter marks in English: ");
            int englishMarks = scanner.nextInt();

            System.out.println("Enter marks in Java: ");
            int javaMarks = scanner.nextInt();

            System.out.println("Enter marks in C#: ");
            int csharpMarks = scanner.nextInt();

            System.out.println("Enter marks in Python: ");
            int pythonMarks = scanner.nextInt();

            System.out.println("Enter marks in Spanish: ");
            int spanishMarks = scanner.nextInt();

            int totalMarks = englishMarks + javaMarks + csharpMarks + pythonMarks + spanishMarks;
            int averageMarks = totalMarks / 5;

            // Storing student details
            studentData.put(studentName, new int[]{englishMarks, javaMarks, csharpMarks, pythonMarks, spanishMarks, totalMarks, averageMarks});
            System.out.println("Student " + studentName + " has an average score of " + averageMarks);
        }

     
        ArrayList<Map.Entry<String, int[]>> sortedStudents = new ArrayList<>();

        for (Map.Entry<String, int[]> entry : studentData.entrySet()) {
            if (sortedStudents.isEmpty()) {
                sortedStudents.add(entry);
            } else {
                int position = 0;
                boolean added = false;

                // Inserting the student into the correct position in the sorted list
                for (Map.Entry<String, int[]> sortedEntry : sortedStudents) {
                    if (entry.getValue()[6] > sortedEntry.getValue()[6]) { // Compare average marks
                        sortedStudents.add(position, entry);
                        added = true;
                        break;
                    }
                    position++;
                }
                if (!added) {
                    sortedStudents.add(entry);
                }
            }
        }

        // Displaying sorted student records
        System.out.println("\nStudents sorted based on average marks (highest first):");
        for (Map.Entry<String, int[]> entry : sortedStudents) {
            String name = entry.getKey();
            int[] marksData = entry.getValue();
            System.out.println("Student: " + name);
            System.out.println("Marks: English=" + marksData[0]
                    + ", Java=" + marksData[1]
                    + ", C#=" + marksData[2]
                    + ", Python=" + marksData[3]
                    + ", Spanish=" + marksData[4]);
            System.out.println("Total Marks: " + marksData[5] + ", Average Marks: " + marksData[6]);
            System.out.println("---------------------------");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        collectStudentData();
    }
}
