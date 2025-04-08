
import java.sql.*;
import java.util.Scanner;

public class EmployeeDatabaseManager {
    private static final String INSERT_EMPLOYEE = "INSERT INTO Employees (name, age, department) VALUES (?, ?, ?)";
    private static final String UPDATE_EMPLOYEE = "UPDATE Employees SET name=?, age=?, department=? WHERE id=?";
    private static final String DELETE_EMPLOYEE = "DELETE FROM Employees WHERE id=?";
    private static final String SELECT_EMPLOYEE = "SELECT * FROM Employees WHERE id=?";

    private static void insertEmployee(Connection dbConnection, Scanner userInput) throws SQLException {
        System.out.print("Enter employee name: ");
        String employeeName = userInput.nextLine();
        System.out.print("Enter employee age: ");
        int employeeAge = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Enter department: ");
        String department = userInput.nextLine();

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(INSERT_EMPLOYEE)) {
            preparedStatement.setString(1, employeeName);
            preparedStatement.setInt(2, employeeAge);
            preparedStatement.setString(3, department);
            preparedStatement.executeUpdate();
            System.out.println("Employee added successfully!");
        }
    }

    private static void updateEmployee(Connection dbConnection, Scanner userInput) throws SQLException {
        System.out.print("Enter Employee ID to update: ");
        int employeeId = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter new name: ");
        String updatedName = userInput.nextLine();
        System.out.print("Enter new age: ");
        int updatedAge = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Enter new department: ");
        String updatedDepartment = userInput.nextLine();

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(UPDATE_EMPLOYEE)) {
            preparedStatement.setString(1, updatedName);
            preparedStatement.setInt(2, updatedAge);
            preparedStatement.setString(3, updatedDepartment);
            preparedStatement.setInt(4, employeeId);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected > 0 ? "Employee details updated successfully!" : "No matching employee found.");
        }
    }

    private static void deleteEmployee(Connection dbConnection, Scanner userInput) throws SQLException {
        System.out.print("Enter Employee ID to delete: ");
        int employeeId = userInput.nextInt();

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(DELETE_EMPLOYEE)) {
            preparedStatement.setInt(1, employeeId);
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted > 0 ? "Employee record deleted successfully!" : "No matching record found.");
        }
    }

    private static void selectEmployee(Connection dbConnection, Scanner userInput) throws SQLException {
        System.out.print("Enter Employee ID to view: ");
        int employeeId = userInput.nextInt();

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(SELECT_EMPLOYEE)) {
            preparedStatement.setInt(1, employeeId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Age: " + resultSet.getInt("age"));
                System.out.println("Department: " + resultSet.getString("department"));
            } else {
                System.out.println("No matching employee found.");
            }
        }
    }

    public static void main(String[] args) {
        try (Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "admin", "SecurePass123");
             Scanner userInput = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n1. Add Employee\n2. Update Employee\n3. Remove Employee\n4. View Employee\n5. Exit");
                System.out.print("Choose an option: ");
                int userChoice = userInput.nextInt();
                userInput.nextLine(); 

                switch (userChoice) {
                    case 1 -> insertEmployee(dbConnection, userInput);
                    case 2 -> updateEmployee(dbConnection, userInput);
                    case 3 -> deleteEmployee(dbConnection, userInput);
                    case 4 -> selectEmployee(dbConnection, userInput);
                    case 5 -> System.exit(0);
                    default -> System.out.println("Invalid choice! Please select a valid option.");
                }
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
