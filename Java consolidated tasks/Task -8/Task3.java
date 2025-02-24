
import java.sql.*;
import java.util.Scanner;

public class EmployeeRecordDeleter {
    private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM Employees WHERE id=?";

    public static void main(String[] args) {
        try (Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "admin", "SecurePass123");
             Scanner userInput = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to delete: ");
            int employeeId = userInput.nextInt();

            try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(DELETE_EMPLOYEE_QUERY)) {
                preparedStatement.setInt(1, employeeId);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected > 0 ? "Employee record deleted successfully!" : "No matching record found for the given ID.");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
