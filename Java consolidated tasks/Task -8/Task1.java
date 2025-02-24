
import java.sql.*;
import java.util.Scanner;

public class EmployeeDataInserter {
    private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO Employees (name, age, department) VALUES (?, ?, ?)";

    public static void insertEmployeeRecords(Connection dbConnection, Scanner userInput) throws SQLException {
        System.out.print("Enter employee name: ");
        String employeeName = userInput.nextLine();
        System.out.print("Enter employee age: ");
        int employeeAge = userInput.nextInt();
        userInput.nextLine();  // Consume newline
        System.out.print("Enter employee department: ");
        String employeeDepartment = userInput.nextLine();

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(INSERT_EMPLOYEE_QUERY)) {
            preparedStatement.setString(1, employeeName);
            preparedStatement.setInt(2, employeeAge);
            preparedStatement.setString(3, employeeDepartment);
            preparedStatement.executeUpdate();
            System.out.println("Employee record inserted successfully!");
        }

        System.out.print("Would you like to add another employee? (yes/no): ");
        String continueInsertion = userInput.nextLine();
        if (continueInsertion.equalsIgnoreCase("yes")) {
            insertEmployeeRecords(dbConnection, userInput);
        }
    }

    public static void main(String[] args) {
        try (Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "admin", "SecurePass123");
             Scanner inputScanner = new Scanner(System.in)) {
            insertEmployeeRecords(databaseConnection, inputScanner);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
