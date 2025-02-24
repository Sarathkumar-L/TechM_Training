
import java.sql.*;
import java.util.Scanner;

public class EmployeeDataUpdater {
    private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE Employees SET name=?, age=?, department=? WHERE id=?";

    public static void main(String[] args) {
        try (Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "admin", "SecurePass123");
             Scanner userInput = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to update: ");
            int employeeId = userInput.nextInt();
            userInput.nextLine();

            System.out.print("Enter new employee name: ");
            String updatedName = userInput.nextLine();
            System.out.print("Enter new employee age: ");
            int updatedAge = userInput.nextInt();
            userInput.nextLine();  
            System.out.print("Enter new employee department: ");
            String updatedDepartment = userInput.nextLine();

            try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(UPDATE_EMPLOYEE_QUERY)) {
                preparedStatement.setString(1, updatedName);
                preparedStatement.setInt(2, updatedAge);
                preparedStatement.setString(3, updatedDepartment);
                preparedStatement.setInt(4, employeeId);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected > 0 ? "Employee record updated successfully!" : "No matching record found for the given ID.");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
